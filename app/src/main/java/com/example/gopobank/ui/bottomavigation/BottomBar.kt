package com.example.gopobank.ui.bottomavigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.gopobank.R
import com.example.gopobank.ui.bottomavigation.BottomNavItem.Card
import com.example.gopobank.ui.bottomavigation.BottomNavItem.Home
import kotlinx.serialization.Serializable

@Composable
fun BottomBar(navController: NavHostController) {
    NavigationBar {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination
        listOf(Home, Card).forEach { topLevelRoute ->
            NavigationBarItem(
                label = { Text(stringResource(topLevelRoute.title)) },
                onClick = {
                    navController.navigate(topLevelRoute) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    Icon(
                        painter = painterResource(topLevelRoute.icon),
                        contentDescription = ""
                    )
                },
                selected = currentRoute?.hierarchy?.any { it.hasRoute(topLevelRoute::class) } == true
            )
        }
    }
}

@Serializable
sealed class BottomNavItem(var title: Int, var icon: Int) {

    @Serializable
    data object Home : BottomNavItem(
        title = R.string.bottom_navigation_home,
        icon = R.drawable.ic_home
    )

    @Serializable
    data object Card : BottomNavItem(
        title = R.string.bottom_navigation_card,
        icon = R.drawable.ic_card
    )
//    data object Chat : BottomNavItem(R.string.bottom_navigation_chat, R.drawable.ic_chat)
//    data object Shop : BottomNavItem(R.string.bottom_navigation_shop, R.drawable.ic_shop)
//    data object History : BottomNavItem(R.string.bottom_navigation_history, R.drawable.ic_history)
}


