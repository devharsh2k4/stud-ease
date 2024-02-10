package com.example.studease.domain.model

import androidx.annotation.DrawableRes
import com.example.studease.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
) {
    object First : OnBoardingPage(
        image = R.drawable.greeting,
        title = "Greetings",
        description = "Are you a student? Because if you are then we have a great news for you!!"
    )
    object Second : OnBoardingPage(
        image = R.drawable.etiquette,
        title = "Explore",
        description = "Find your favorite rooms and start a beautiful journey you didn't know about."
    )
    object Third : OnBoardingPage(
        image = R.drawable.apology,
        title = "Features",
        description = "Check out the cool features !! Good Luck "
    )


}