package com.example.casainteligente.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Memory
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Header() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 20.dp),

        horizontalArrangement = Arrangement.SpaceBetween,

        verticalAlignment = Alignment.CenterVertically
    ) {

        Column {

            Text(
                text = "🏠 Smart Home",
                style = MaterialTheme.typography.headlineMedium
            )

            Text(
                text = "Buenos días, Dylan",
                style = MaterialTheme.typography.bodyLarge
            )

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Icon(
                    imageVector = Icons.Default.Memory,
                    contentDescription = null
                )

                Text(
                    text = " ESP32 Online",
                    style = MaterialTheme.typography.bodyMedium
                )

            }

        }

        Column(
            horizontalAlignment = Alignment.End
        ) {

            Text(
                text = "24°C",
                style = MaterialTheme.typography.headlineSmall
            )

            Text(
                text = "65% Humedad",
                style = MaterialTheme.typography.bodyMedium
            )

        }

    }

}