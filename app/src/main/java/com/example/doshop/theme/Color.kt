package com.example.doshop.theme

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val Blue = Color(0xFF2685BF)
val LightBlue = Color(0xFF3D9DD9)
val Cyan = Color(0xFF94D7F2)

val DarkBlue = Color(0xFF053C5E)
val Black = Color(0xFF000000)
val White = Color(0xFFFFFFFF)

private val DarkColors = darkColors(
    primary = LightBlue,
    secondary = Blue,
    primaryVariant = Cyan
)

private val LightColors = lightColors(
    primary = Blue,
    secondary = LightBlue,
    primaryVariant = DarkBlue
)