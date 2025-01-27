/*
 * Copyright (C) 2019 The Android Open Source Project
 * Copyright (C) 2021 Bootleggers ROM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.keyguard.clock;

import android.app.WallpaperManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.Paint.Style;
import android.provider.Settings;
import android.util.MathUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.core.graphics.ColorUtils;

import com.android.internal.colorextraction.ColorExtractor;
import com.android.systemui.R;
import com.android.systemui.colorextraction.SysuiColorExtractor;
import com.android.systemui.plugins.ClockPlugin;

import java.util.TimeZone;

import static android.view.View.TEXT_ALIGNMENT_CENTER;

/**
 * Plugin for the default clock face used only to provide a preview.
 */
public class ClockertinoClockController implements ClockPlugin {

    /**
     * Resources used to get title and thumbnail.
     */
    private final Resources mResources;

    /**
     * LayoutInflater used to inflate custom clock views.
     */
    private final LayoutInflater mLayoutInflater;

    /**
     * Extracts accent color from wallpaper.
     */
    private final SysuiColorExtractor mColorExtractor;

    /**
     * Computes preferred position of clock.
     */
    private float mDarkAmount;
    private final int mStatusBarHeight;
    private final int mKeyguardLockPadding;
    private final int mKeyguardLockHeight;
    private final int mBurnInOffsetY;

    /**
     * Renders preview from clock view.
     */
    private final ViewPreviewer mRenderer = new ViewPreviewer();

    /**
     * Helper to extract colors from wallpaper palette for clock face.
     */
    private final ClockPalette mPalette = new ClockPalette();

    /**
     * Root view of clock.
     */
    private ClockLayout mBigClockView;

    private final Context mContext;

    /**
     * Views for the dynamic gradient tinting
     */
    private LinearLayout mTimeWidgetBase;
    private LinearLayout mDateWidgetBase;
    private TextClock mTimeH;
    private TextClock mTimeM;
    private TextClock mTimeS;

    /**
     * Create a ClockertinoClockController instance.
     *
     * @param res Resources contains title and thumbnail.
     * @param inflater Inflater used to inflate custom clock views.
     * @param colorExtractor Extracts accent color from wallpaper.
     */
    ClockertinoClockController(Resources res, LayoutInflater inflater,
            SysuiColorExtractor colorExtractor) {
        this(res, inflater, colorExtractor, null);
    }

    /**
     * Create a ClockertinoClockController instance.
     *
     * @param res Resources contains title and thumbnail.
     * @param inflater Inflater used to inflate custom clock views.
     * @param colorExtractor Extracts accent color from wallpaper.
     * @param context A context.
     */
    ClockertinoClockController(Resources res, LayoutInflater inflater,
            SysuiColorExtractor colorExtractor, Context context) {
        mResources = res;
        mLayoutInflater = inflater;
        mColorExtractor = colorExtractor;
        mContext = context;
        mStatusBarHeight = res.getDimensionPixelSize(R.dimen.status_bar_height);
        mKeyguardLockPadding = res.getDimensionPixelSize(R.dimen.keyguard_lock_padding);
        mKeyguardLockHeight = res.getDimensionPixelSize(R.dimen.keyguard_lock_height);
        mBurnInOffsetY = res.getDimensionPixelSize(R.dimen.burn_in_prevention_offset_y);
    }

    private void createViews() {
        mBigClockView = (ClockLayout) mLayoutInflater
                .inflate(R.layout.clock_clockertino, null);
        mTimeWidgetBase = mBigClockView.findViewById(R.id.timeWidget);
        mDateWidgetBase = mBigClockView.findViewById(R.id.dateWidget);
        mTimeH = mBigClockView.findViewById(R.id.textClockHH);
        mTimeM = mBigClockView.findViewById(R.id.textClockMM);
        mTimeS = mBigClockView.findViewById(R.id.textClockSS);
    }

    @Override
    public void onDestroyView() {
        mBigClockView = null;
        mTimeWidgetBase = null;
        mDateWidgetBase = null;
    }

    @Override
    public String getName() {
        return "clockertino";
    }

    @Override
    public String getTitle() {
        return "Clockertino";
    }

    @Override
    public Bitmap getThumbnail() {
        return BitmapFactory.decodeResource(mResources, R.drawable.clockertino_thumbnail);
    }

    @Override
    public Bitmap getPreview(int width, int height) {

        // Use the big clock view for the preview
        View view = getBigClockView();

        // Initialize state of plugin before generating preview.
        setDarkAmount(1f);
        ColorExtractor.GradientColors colors = mColorExtractor.getColors(
                WallpaperManager.FLAG_LOCK);
        setColorPalette(colors.supportsDarkText(), colors.getColorPalette());
        onTimeTick();

        return mRenderer.createPreview(view, width, height);
    }

    @Override
    public View getView() {
        if (mBigClockView == null) {
            createViews();
        }
        return mBigClockView;
    }

    @Override
    public View getBigClockView() {
        if (mBigClockView  == null) {
            createViews();
        }
        return mBigClockView ;
    }

    @Override
    public int getPreferredY(int totalHeight) {
        // On AOD, clock needs to appear below the status bar with enough room for pixel shifting
        int aodY = mStatusBarHeight + mKeyguardLockHeight + 2 * mKeyguardLockPadding
                + mBurnInOffsetY + mTimeWidgetBase.getHeight() + (mTimeWidgetBase.getHeight() / 2);
        // On lock screen, clock needs to appear below the lock icon
        int lockY =  mStatusBarHeight + mKeyguardLockHeight + 2 * mKeyguardLockPadding + (mTimeWidgetBase.getHeight() / 2);
        return (int) MathUtils.lerp(lockY, aodY, mDarkAmount);
    }

    @Override
    public void setStyle(Style style) {
    }

    @Override
    public void setTextColor(int color) {
    }

    @Override
    public void setColorPalette(boolean supportsDarkText, int[] colorPalette) {
        mPalette.setColorPalette(supportsDarkText, colorPalette);
        updateColor();
    }

    private void updateColor() {
        final int primary = mPalette.getPrimaryColor();

        int[] gradColors = {primary, generateColorDesat(primary)};
        GradientDrawable bgTinted = new GradientDrawable(Orientation.TOP_BOTTOM, gradColors);
        bgTinted.setGradientType(GradientDrawable.LINEAR_GRADIENT);
        mTimeWidgetBase.setBackground(bgTinted);
        mDateWidgetBase.setBackground(bgTinted);
    }

    @Override
    public void setDarkAmount(float darkAmount) {
        mDarkAmount = darkAmount;
        if (mPalette != null) {
            mPalette.setDarkAmount(darkAmount);
        }
    }

    @Override
    public void onTimeTick() {
        mBigClockView.onTimeChanged();
        mTimeH.refreshTime();
        mTimeM.refreshTime();
        mTimeS.refreshTime();
    }

    @Override
    public void onTimeZoneChanged(TimeZone timeZone) {
    }

    @Override
    public boolean shouldShowStatusArea() {
        if (mContext == null) return true;
        return Settings.System.getInt(mContext.getContentResolver(), Settings.System.CLOCK_SHOW_STATUS_AREA, 1) == 1;
    }

    private int generateColorDesat(int color) {
        float[] hslParams = new float[3];
        ColorUtils.colorToHSL(color, hslParams);
        // Conversion to desature the color?
        hslParams[1] = hslParams[1]*0.64f;
        return ColorUtils.HSLToColor(hslParams);
    }
}
