package com.example.casainteligente.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.casainteligente.ui.screens.automation.AutomationScreen
import com.example.casainteligente.ui.screens.history.HistoryScreen
import com.example.casainteligente.ui.screens.home.HomeScreen
import com.example.casainteligente.ui.screens.room.RoomDetailScreen
import com.example.casainteligente.ui.screens.settings.SettingsScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.HOME
    ) {

        composable(Routes.HOME) {
            HomeScreen(navController)
        }

        composable(Routes.ROOM) {
            RoomDetailScreen(navController)
        }

        composable(Routes.AUTOMATION) {
            AutomationScreen(navController)
        }

        composable(Routes.HISTORY) {
            HistoryScreen(navController)
        }

        composable(Routes.SETTINGS) {
            SettingsScreen(navController)
        }

    }

}