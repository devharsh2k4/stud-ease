package com.example.studease.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash_screen")
    object Welcome : Screen("welcome_screen")
    object Home : Screen("home_screen")

    object Wishlist: Screen("wish_screen")

    object Split: Screen("split_screen")

    object Profile: Screen("profile_screen")

    object Search: Screen("search_screen")

}