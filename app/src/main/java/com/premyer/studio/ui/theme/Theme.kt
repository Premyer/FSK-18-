package com.premyer.studio.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun Premyer18StudioTheme(
    darkTheme: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) darkColorScheme(
        primary = androidx.compose.ui.graphics.Color(0xFF7CFFB2),
        secondary = androidx.compose.ui.graphics.Color(0xFF6FC8FF),
        background = androidx.compose.ui.graphics.Color(0xFF0A0A0A),
        surface = androidx.compose.ui.graphics.Color(0xFF121212),
        onPrimary = androidx.compose.ui.graphics.Color(0xFF0A0A0A),
        onSecondary = androidx.compose.ui.graphics.Color(0xFF0A0A0A),
        onBackground = androidx.compose.ui.graphics.Color(0xFFEAEAEA),
        onSurface = androidx.compose.ui.graphics.Color(0xFFEAEAEA),
        tertiary = androidx.compose.ui.graphics.Color(0xFF1E1E1E)
    ) else lightColorScheme(
        primary = androidx.compose.ui.graphics.Color(0xFF7CFFB2),
        secondary = androidx.compose.ui.graphics.Color(0xFF6FC8FF),
        background = androidx.compose.ui.graphics.Color.White,
        surface = androidx.compose.ui.graphics.Color.White,
        onPrimary = androidx.compose.ui.graphics.Color(0xFF0A0A0A),
        onSecondary = androidx.compose.ui.graphics.Color(0xFF0A0A0A),
        onBackground = androidx.compose.ui.graphics.Color(0xFF0A0A0A),
        onSurface = androidx.compose.ui.graphics.Color(0xFF0A0A0A),
        tertiary = androidx.compose.ui.graphics.Color(0xFFF2F2F2)
    )

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

val Typography = Typography(
    headlineMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
        lineHeight = 36.sp
    ),
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.SemiBold,
        fontSize = 22.sp,
        lineHeight = 28.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp
    )
)
