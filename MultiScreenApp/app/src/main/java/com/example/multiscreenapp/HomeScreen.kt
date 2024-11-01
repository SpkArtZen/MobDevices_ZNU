package com.example.multiscreenapp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

@Composable
fun HomeScreen(navController: NavController) {
    var text by remember { mutableStateOf("") }
    val items = listOf("Item 1", "Item 2", "Item 3")

    Column(modifier = Modifier.padding(16.dp)) {
        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Enter something") }
        )
        Text(text = "You typed: $text")

        Button(
            onClick = { navController.navigate("settings") },
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            Text("Go to Settings")
        }

        LazyColumn {
            items(items) { item ->
                Text(
                    text = item,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .clickable {
                            navController.navigate("details/${item}")
                        }
                )
            }
        }
    }
}
