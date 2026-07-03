package com.example.casainteligente

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.casainteligente.navigation.AppNavigation
import com.example.casainteligente.ui.theme.CasaInteligenteTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContent {

            CasaInteligenteTheme {

                AppNavigation()

            }

        }

    }

}