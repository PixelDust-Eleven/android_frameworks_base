/*
 * Copyright (C) 2014 The Android Open Source Project
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

package com.android.internal.util.pixeldust;

public class ThemesUtils {

    public static final String[] ACCENTS = {
            // AOSP colors
            "com.android.theme.color.space", // Space
            "com.android.theme.color.purple", // Purple
            "com.android.theme.color.orchid", // Orchid
            "com.android.theme.color.ocean", // Ocean
            "com.android.theme.color.green", // Green
            "com.android.theme.color.cinnamon", // Cinnamon
            // New AOSP colors from Android 11
            "com.android.theme.color.amethyst", // Amethyst
            "com.android.theme.color.aquamarine", // Aquamarine
            "com.android.theme.color.carbon", // Carbon
            "com.android.theme.color.palette", // Palette
            "com.android.theme.color.sand", // Sand
            "com.android.theme.color.tangerine", // Tangerine
            // Custom colors
            "com.android.theme.color.amber", // Amber
            "com.android.theme.color.azureradiance", // AzureRadiance
            "com.android.theme.color.blue", // Blue
            "com.android.theme.color.bluegrey", // Blue Grey
            "com.android.theme.color.brown", // Brown
            "com.android.theme.color.cyan", // Cyan
            "com.android.theme.color.deeporange", // Deep Orange
            "com.android.theme.color.deeppurple", // Deep Purple
            "com.android.theme.color.grey", // Grey
            "com.android.theme.color.indigo", // Indigo
            "com.android.theme.color.lightblue", // Light Blue
            "com.android.theme.color.lightgreen", // Light Green
            "com.android.theme.color.lime", // Lime
            "com.android.theme.color.orange", // Orange
            "com.android.theme.color.pink", // Pink
            "com.android.theme.color.red", // Red
            "com.android.theme.color.teal", // Teal
            "com.android.theme.color.yellow", // Yellow
            // Brand colors
            "com.android.theme.color.androidonegreen", // AndroidOneGreen
            "com.android.theme.color.cocacolared", // CocaColaRed
            "com.android.theme.color.discordpurple", // DiscordPurple
            "com.android.theme.color.facebookblue", // FacebookBlue
            "com.android.theme.color.instagramcerise", // InstagramCerise
            "com.android.theme.color.jollibeecrimson", // JollibeeCrimson
            "com.android.theme.color.monsterenergygreen", // MonsterEnergyGreen
            "com.android.theme.color.nextbitmint", // NextbitMint
            "com.android.theme.color.oneplusred", // OneplusRed
            "com.android.theme.color.pepsiblue", // PepsiBlue
            "com.android.theme.color.pocophoneyellow", // PocophoneYellow
            "com.android.theme.color.razergreen", // RazerGreen
            "com.android.theme.color.samsungblue", // SamsungBlue
            "com.android.theme.color.spotifygreen", // SpotifyGreen
            "com.android.theme.color.starbucksgreen", // StarbucksGreen
            "com.android.theme.color.twitchpurple", // TwitchPurple
            "com.android.theme.color.twitterblue", // TwitterBlue
            "com.android.theme.color.xboxgreen", // XboxGreen
            "com.android.theme.color.xiaomiorange", // XiaomiOrange
    };

    public static final String[] ADAPTIVE_ICON_SHAPE = {
            "com.android.theme.icon.pebble",
            "com.android.theme.icon.vessel",
            "com.android.theme.icon.taperedrect",
            "com.android.theme.icon.teardrop",
            "com.android.theme.icon.squircle",
            "com.android.theme.icon.roundedrect",
            "com.android.theme.icon.square",
            "com.android.theme.icon.hexagon",
            "com.android.theme.icon.cylinder",
            "com.android.theme.icon.heart",
    };

    public static final String[] PITCH_BLACK = {
            "com.android.theme.pitchblack.system",
            "com.android.theme.pitchblack.systemui",
    };

    public static final String[] SOLARIZED_DARK = {
            "com.android.theme.solarizeddark.system",
            "com.android.theme.solarizeddark.systemui",
    };

    public static final String[] CHOCO_X = {
            "com.android.theme.chocox.system",
            "com.android.theme.chocox.systemui",
    };

    public static final String[] DARK_GREY = {
            "com.android.theme.darkgrey.system",
            "com.android.theme.darkgrey.systemui",
    };

    public static final String[] STATUSBAR_ICONS = {
            "com.android.theme.icon_pack.filled.android",
            "com.android.theme.icon_pack.rounded.android",
            "com.android.theme.icon_pack.circular.android",
            "com.android.theme.icon_pack.kai.android",
            "com.android.theme.icon_pack.sam.android",
            "com.android.theme.icon_pack.victor.android",
    };

    public static final String[] FONTS = {
            "com.android.theme.font.aclonicasource",
            "com.android.theme.font.amarantesource",
            "com.android.theme.font.arbutussource",
            "com.android.theme.font.bariolsource",
            "com.android.theme.font.cagliostrosource",
            "com.android.theme.font.comicsanssource",
            "com.android.theme.font.coolstorysource",
            "com.android.theme.font.firasans",
            "com.android.theme.font.googlesans",
            "com.android.theme.font.googlesansmedium",
            "com.android.theme.font.lgsmartgothicsource",
            "com.android.theme.font.linotte",
            "com.android.theme.font.oneplusslate", 
            "com.android.theme.font.rosemarysource",
            "com.android.theme.font.samsungone",
            "com.android.theme.font.sanfrancisco",
            "com.android.theme.font.sonysketchsource",
            "com.android.theme.font.summerdream",
            "com.android.theme.font.surfersource",

    };

    public static final String[] NAVBAR_STYLES = {
            "com.android.theme.navbar.android",
            "com.android.theme.navbar.asus",
            "com.android.theme.navbar.moto",
            "com.android.theme.navbar.nexus",
            "com.android.theme.navbar.old",
            "com.android.theme.navbar.oneplus",
            "com.android.theme.navbar.oneui",
            "com.android.theme.navbar.pd",
            "com.android.theme.navbar.sammy",
            "com.android.theme.navbar.tecno",
    };

    public static final String[] QS_TILE_THEMES = {
            "com.android.systemui.qstile.default",
            "com.android.systemui.qstile.circletrim",
            "com.android.systemui.qstile.dualtonecircletrim",
            "com.android.systemui.qstile.squircletrim",
            "com.android.systemui.qstile.attemptmountain",
            "com.android.systemui.qstile.cosmos",
            "com.android.systemui.qstile.dottedcircle",
            "com.android.systemui.qstile.ninja",
            "com.android.systemui.qstile.pokesign",
            "com.android.systemui.qstile.wavey",
    };

    public static final String[] STATUSBAR_HEIGHT = {
            "com.gnonymous.gvisualmod.sbh_m", // 1
            "com.gnonymous.gvisualmod.sbh_l", // 2
            "com.gnonymous.gvisualmod.sbh_xl", // 3
    };

    public static final String[] UI_RADIUS = {
            "com.gnonymous.gvisualmod.urm_r", // 1
            "com.gnonymous.gvisualmod.urm_m", // 2
            "com.gnonymous.gvisualmod.urm_l", // 3
    };

    public static final String[] NAVBAR_COLORS = {
            "com.gnonymous.gvisualmod.space", // Space
            "com.gnonymous.gvisualmod.purple", // Purple
            "com.gnonymous.gvisualmod.orchid", // Orchid
            "com.gnonymous.gvisualmod.ocean", // Ocean
            "com.gnonymous.gvisualmod.green", // Green
            "com.gnonymous.gvisualmod.cinnamon", // Cinnamon
            "com.gnonymous.gvisualmod.amethyst", // Amethyst
            "com.gnonymous.gvisualmod.aquamarine", // Aquamarine
            "com.gnonymous.gvisualmod.carbon", // Carbon
            "com.gnonymous.gvisualmod.palette", // Palette
            "com.gnonymous.gvisualmod.sand", // Sand
            "com.gnonymous.gvisualmod.tangerine", // Tangerine
            "com.gnonymous.gvisualmod.amber", // Amber
            "com.gnonymous.gvisualmod.azureradiance", // AzureRadiance
            "com.gnonymous.gvisualmod.blue", // Blue
            "com.gnonymous.gvisualmod.bluegrey", // Blue Grey
            "com.gnonymous.gvisualmod.brown", // Brown
            "com.gnonymous.gvisualmod.cyan", // Cyan
            "com.gnonymous.gvisualmod.deeporange", // Deep Orange
            "com.gnonymous.gvisualmod.deeppurple", // Deep Purple
            "com.gnonymous.gvisualmod.grey", // Grey
            "com.gnonymous.gvisualmod.indigo", // Indigo
            "com.gnonymous.gvisualmod.lightblue", // Light Blue
            "com.gnonymous.gvisualmod.lightgreen", // Light Green
            "com.gnonymous.gvisualmod.lime", // Lime
            "com.gnonymous.gvisualmod.orange", // Orange
            "com.gnonymous.gvisualmod.pink", // Pink
            "com.gnonymous.gvisualmod.red", // Red
            "com.gnonymous.gvisualmod.teal", // Teal
            "com.gnonymous.gvisualmod.yellow", // Yellow
            "com.gnonymous.gvisualmod.androidonegreen", // AndroidOneGreen
            "com.gnonymous.gvisualmod.cocacolared", // CocaColaRed
            "com.gnonymous.gvisualmod.discordpurple", // DiscordPurple
            "com.gnonymous.gvisualmod.facebookblue", // FacebookBlue
            "com.gnonymous.gvisualmod.instagramcerise", // InstagramCerise
            "com.gnonymous.gvisualmod.jollibeecrimson", // JollibeeCrimson
            "com.gnonymous.gvisualmod.monsterenergygreen", // MonsterEnergyGreen
            "com.gnonymous.gvisualmod.nextbitmint", // NextbitMint
            "com.gnonymous.gvisualmod.oneplusred", // OneplusRed
            "com.gnonymous.gvisualmod.pepsiblue", // PepsiBlue
            "com.gnonymous.gvisualmod.pocophoneyellow", // PocophoneYellow
            "com.gnonymous.gvisualmod.razergreen", // RazerGreen
            "com.gnonymous.gvisualmod.samsungblue", // SamsungBlue
            "com.gnonymous.gvisualmod.spotifygreen", // SpotifyGreen
            "com.gnonymous.gvisualmod.starbucksgreen", // StarbucksGreen
            "com.gnonymous.gvisualmod.twitchpurple", // TwitchPurple
            "com.gnonymous.gvisualmod.twitterblue", // TwitterBlue
            "com.gnonymous.gvisualmod.xboxgreen", // XboxGreen
            "com.gnonymous.gvisualmod.xiaomiorange", // XiaomiOrange
    };

    // Switch styles
    public static final String[] SWITCH_STYLES = {
            "com.android.system.switch.aosp", // 1
            "com.android.system.switch.oneplus", // 2
            "com.android.system.switch.narrow", // 3
            "com.android.system.switch.contained", // 4
            "com.android.system.switch.telegram", // 5
            "com.android.system.switch.md2", // 6
            "com.android.system.switch.retro", // 7
            "com.android.system.switch.oos", // 8
    };

    // Brightness slider styles
    public static final String[] BRIGHTNESS_SLIDER_STYLES = {
            "com.android.systemui.brightness.slider.daniel", // 1
            "com.android.systemui.brightness.slider.mememini", // 2
            "com.android.systemui.brightness.slider.memeround", // 3
            "com.android.systemui.brightness.slider.memeroundstroke", // 4
            "com.android.systemui.brightness.slider.memestroke", // 5
    };
}
