package com.example.casainteligente.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoMode
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.casainteligente.navigation.Routes

enum class BottomItem(

    val title: String,

    val route: String,

    val icon: ImageVector

) {

    HOME(
        "Inicio",
        Routes.HOME,
        Icons.Default.Home
    ),

    AUTOMATION(
        "Auto",
        Routes.AUTOMATION,
        Icons.Default.AutoMode
    ),

    HISTORY(
        "Historial",
        Routes.HISTORY,
        Icons.Default.History
    ),

    SETTINGS(
        "Ajustes",
        Routes.SETTINGS,
        Icons.Default.Settings
    )

}