package com.example.studease.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.studease.presentation.screens.home.HomeScreen
import com.example.studease.presentation.screens.profile.ProfileScreen
import com.example.studease.presentation.screens.splash.SplashScreen
import com.example.studease.presentation.screens.split.SplitScreen
import com.example.studease.presentation.screens.welcome.WelcomeScreen
import com.example.studease.presentation.screens.wishlist.WishlistScreen
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route,
    ) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(route = Screen.Welcome.route) {
            WelcomeScreen(navController = navController)
        }
        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController)
        }

        composable(route = Screen.Search.route) {

        }

        composable(route= Screen.Profile.route) {
            ProfileScreen(navController = navController)
        }

        composable(route = Screen.Split.route){
            SplitScreen(navController = navController)
        }

        composable(route= Screen.Wishlist.route){
            WishlistScreen(navController = navController)
        }

    }
}