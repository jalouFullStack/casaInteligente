package com.example.casainteligente.ui.screens.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.casainteligente.ui.components.BottomBar
import com.example.casainteligente.ui.components.Header

@Composable
fun HomeScreen(
    navController: NavController
) {

    Scaffold(

        bottomBar = {

            BottomBar(navController)

        }

    ) { padding ->

        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {

            Header()

        }

    }

}