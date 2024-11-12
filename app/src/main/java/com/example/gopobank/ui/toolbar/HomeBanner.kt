package com.example.gopobank.ui.toolbar

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gopobank.ui.theme.CustomTheme


@Composable
fun HomeBanner() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(
                top = CustomTheme.dimensions.paddingTiny,
                bottom = CustomTheme.dimensions.paddingXXS,
                end = CustomTheme.dimensions.paddingM
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            modifier = Modifier
                .align(alignment = Alignment.CenterStart)
                .padding(start = CustomTheme.dimensions.paddingM)
                .size(32.dp)
                .border(1.dp, Color.Transparent, RoundedCornerShape(24.dp)),
            imageVector = Icons.Default.Face,
            contentDescription = "Localized description"
        )
        Text(text = "GopoBank")
    }
}


@Preview
@Composable
fun ToolbarPreview() {
    HomeBanner()
}