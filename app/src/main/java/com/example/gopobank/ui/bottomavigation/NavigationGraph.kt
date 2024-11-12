package com.example.gopobank.ui.bottomavigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.gopobank.ui.bottomavigation.BottomNavItem.Card
import com.example.gopobank.ui.bottomavigation.BottomNavItem.Home
import com.example.gopobank.ui.screens.CardScreen
import com.example.gopobank.ui.screens.HomeScreen


@Composable
fun NavigationGraph(navController: NavHostController, innerPadding: PaddingValues) {
    NavHost(
        modifier = Modifier.padding(innerPadding),
        navController = navController,
        startDestination = Home,
    ) {
        composable<Home> {
            HomeScreen()
        }

        composable<Card> {
            CardScreen()
        }
    }
}

