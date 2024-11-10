package com.example.gopobank

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.compose.rememberNavController
import com.example.gopobank.ui.bottomavigation.BottomBar
import com.example.gopobank.ui.bottomavigation.NavigationGraph
import com.example.gopobank.ui.theme.GopoBankTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GopoBankTheme {
                val navController = rememberNavController()
                var buttonsVisible by remember { mutableStateOf(true) }
                Scaffold(
                    bottomBar = {
                        BottomBar(navController)
                    }
                ) { innerPadding ->
                    NavigationGraph(navController, innerPadding)
                }
            }
        }
    }
}