package com.example.multiscreenapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DetailsScreen(navController: NavController, itemId: String?) {
    var counter by remember { mutableStateOf(0) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Details for $itemId", style = MaterialTheme.typography.headlineMedium)
        Text(text = "Counter: $counter")
        Button(onClick = { counter++ }) {
            Text("Increment Counter")
        }
        Button(onClick = { navController.popBackStack() }) {
            Text("Back to Home")
        }
    }
}
