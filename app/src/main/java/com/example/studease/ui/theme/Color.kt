package com.example.studease.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val LightGray = Color(0XFFD8D8D8)
val DarkGray = Color(0XFF2A2A2A)

val Colors.welcomeScreenBackgroundColor
    @Composable
    get() = if (isSystemInDarkTheme()) Color.Black else Color.White

val Colors.titleColor
    @Composable
    get() = if (isSystemInDarkTheme()) LightGray else DarkGray

val Colors.descriptionColor
    @Composable
    get() = if (isSystemInDarkTheme()) LightGray.copy(alpha = 0.5f)
    else DarkGray.copy(alpha = 0.5f)

val Colors.activeIndicatorColor
    @Composable
    get() = if (isSystemInDarkTheme()) Purple700 else Purple500

val Colors.inactiveIndicatorColor
    @Composable
    get() = if (isSystemInDarkTheme()) DarkGray else LightGray

val Colors.buttonBackgroundColor
    @Composable
    get() = if (isSystemInDarkTheme()) Purple700 else Purple500

val Colors.topAppBarContentColor : Color
    @Composable
    get() = if (isSystemInDarkTheme()) LightGray  else Color.White

val Colors.topAppBarBackgroundColor : Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color.Black else Purple500