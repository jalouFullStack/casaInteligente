package com.example.casainteligente.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoMode
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.casainteligente.navigation.Routes

@Composable
fun BottomBar(
    navController: NavController
) {

    val currentRoute =
        navController.currentBackStackEntryAsState().value?.destination?.route

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface
    ) {

        BottomItem.entries.forEach { item ->

            NavigationBarItem(

                selected = currentRoute == item.route,

                onClick = {

                    if (currentRoute != item.route) {

                        navController.navigate(item.route)

                    }

                },

                icon = {

                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title
                    )

                },

                label = {

                    Text(item.title)

                },

                colors = NavigationBarItemDefaults.colors()

            )

        }

    }

}