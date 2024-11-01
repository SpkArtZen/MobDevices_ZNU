// ThemeViewModel.kt
package com.example.multiscreenapp

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class ThemeViewModel : ViewModel() {
    var isDarkMode by mutableStateOf(false)
        private set

    fun toggleDarkMode() {
        isDarkMode = !isDarkMode
    }
}
