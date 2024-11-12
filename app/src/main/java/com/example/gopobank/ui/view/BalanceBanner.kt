package com.example.gopobank.ui.view

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gopobank.R
import com.example.gopobank.ui.theme.CustomTheme

@Preview(showBackground = true)
@Composable
fun BalanceBanner() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = CustomTheme.dimensions.paddingL,
                end = CustomTheme.dimensions.paddingXL
            ),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(text = stringResource(R.string.title_your_balance))
            Text(text = "$ 7,546")
        }
        Icon(
            modifier = Modifier.border(width = 1.dp, color = Color.Yellow),
            imageVector = Icons.Default.Search,
            contentDescription = ""
        )
    }
}