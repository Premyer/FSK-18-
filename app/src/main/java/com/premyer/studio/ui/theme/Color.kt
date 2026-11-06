package com.premyer.studio.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

private val NeonGreen = Color(0xFF7CFFB2)
private val NeonBlue = Color(0xFF6FC8FF)
private val Black = Color(0xFF0A0A0A)
private val Charcoal = Color(0xFF121212)
private val Silver = Color(0xFFEAEAEA)
private val Grey = Color(0xFFB9B9B9)

private val DarkColorScheme = darkColorScheme(
    primary = NeonGreen,
    secondary = NeonBlue,
    background = Black,
    surface = Charcoal,
    onPrimary = Black,
    onSecondary = Black,
    onBackground = Silver,
    onSurface = Silver,
    tertiary = Color(0xFF1E1E1E)
)

private val LightColorScheme = lightColorScheme(
    primary = NeonGreen,
    secondary = NeonBlue,
    background = Color.White,
    surface = Color.White,
    onPrimary = Black,
    onSecondary = Black,
    onBackground = Black,
    onSurface = Black,
    tertiary = Color(0xFFF2F2F2)
)

val AppColors = mapOf(
    "neonGreen" to NeonGreen,
    "neonBlue" to NeonBlue,
    "black" to Black,
    "charcoal" to Charcoal,
    "silver" to Silver,
    "grey" to Grey
)
