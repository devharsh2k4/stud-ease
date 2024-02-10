package com.example.studease

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.studease.navigation.SetupNavGraph
import com.example.studease.presentation.screens.maps.LocationPermissionScreen
import com.example.studease.presentation.screens.maps.MapScreen
import com.example.studease.ui.theme.StudEaseTheme
import com.example.studease.util.checkForPermission
import com.google.accompanist.pager.ExperimentalPagerApi
import dagger.hilt.android.AndroidEntryPoint

@ExperimentalPagerApi
@AndroidEntryPoint


class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController

    @OptIn(ExperimentalPagerApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StudEaseTheme {
                navController = rememberNavController()
                SetupNavGraph(navController = navController)

                var hasLocationPermission by remember {
                    mutableStateOf(checkForPermission(this))
                }
                if (hasLocationPermission) {
                    MapScreen(this)
                } else {
                    LocationPermissionScreen {
                        hasLocationPermission = true
                    }
                }
            }
        }
    }
}

