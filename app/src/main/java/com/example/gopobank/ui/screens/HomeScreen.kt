package com.example.gopobank.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.gopobank.ui.theme.CustomTheme
import com.example.gopobank.ui.toolbar.HomeBanner
import com.example.gopobank.ui.view.BalanceBanner

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(Modifier.height(CustomTheme.dimensions.paddingXL))
        HomeBanner()
        BalanceBanner()
    }
}
