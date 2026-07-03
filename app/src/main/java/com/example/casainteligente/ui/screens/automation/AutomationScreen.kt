package com.example.casainteligente.ui.screens.automation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.casainteligente.ui.components.BottomBar

@Composable
fun AutomationScreen(
    navController: NavController
) {

    Scaffold(

        bottomBar = {

            BottomBar(navController)

        }

    ) { padding ->

        Box(

            modifier = Modifier
                .fillMaxSize(),

            contentAlignment = Alignment.Center

        ) {

            Text("Automation Screen")

        }

    }

}