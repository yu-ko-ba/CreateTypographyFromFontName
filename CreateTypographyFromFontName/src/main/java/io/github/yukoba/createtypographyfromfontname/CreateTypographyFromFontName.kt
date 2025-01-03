package io.github.yukoba.createtypographyfromfontname

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont

fun createTypographyFromFontName(fontName: String): Typography {
    val fontFamily = FontFamily(
        Font(
            googleFont = GoogleFont(name = fontName),
            fontProvider = GoogleFont.Provider(
                providerAuthority = "com.google.android.gms.fonts",
                providerPackage = "com.google.android.gms",
                certificates = R.array.com_google_android_gms_fonts_certs,
            ),
        ),
    )

    val typography = Typography()
    return Typography(
        displayLarge = typography.displayLarge.copy(fontFamily = fontFamily),
        displayMedium = typography.bodyMedium.copy(fontFamily = fontFamily),
        displaySmall = typography.displaySmall.copy(fontFamily = fontFamily),
        headlineLarge = typography.headlineLarge.copy(fontFamily = fontFamily),
        headlineMedium = typography.headlineMedium.copy(fontFamily = fontFamily),
        headlineSmall = typography.headlineSmall.copy(fontFamily = fontFamily),
        titleLarge = typography.titleLarge.copy(fontFamily = fontFamily),
        titleMedium = typography.titleMedium.copy(fontFamily = fontFamily),
        titleSmall = typography.titleSmall.copy(fontFamily = fontFamily),
        bodyLarge = typography.bodyLarge.copy(fontFamily = fontFamily),
        bodyMedium = typography.bodyMedium.copy(fontFamily = fontFamily),
        bodySmall = typography.bodySmall.copy(fontFamily = fontFamily),
        labelLarge = typography.labelLarge.copy(fontFamily = fontFamily),
        labelMedium = typography.labelMedium.copy(fontFamily = fontFamily),
        labelSmall = typography.labelSmall.copy(fontFamily = fontFamily),
    )
}