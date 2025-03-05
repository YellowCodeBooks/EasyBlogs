package com.example.easyblogs.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable

@Serializable
object Onboarding

@Serializable
object Home

@Composable
fun AppNavigation(
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Onboarding,
        modifier = modifier
    ) {
        composable<Onboarding> {
            Onboarding()
        }
        composable<Home> {
            Home()
        }
    }
}