package com.example.doshop.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.doshop.preview.DevicePreviews
import com.example.doshop.theme.Blue
import com.example.doshop.theme.DoShopTheme
import com.example.doshop.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarItem(
    onBackClick: () -> Unit
) {
    Surface{
        TopAppBar(
            modifier = Modifier.fillMaxWidth(),
            title = { Text(text = "DoShop", color = White) },
            colors = topAppBarColors(
                containerColor = Blue,
            ),
            navigationIcon = {
                IconButton(onClick = onBackClick) {
                    Icon(Icons.Default.ArrowBack, contentDescription = "back arrow icon", tint = White)
                }
            }
        )
    }
}

@DevicePreviews
@Composable
private fun AppBarItemPreview() {
    DoShopTheme {
        TopAppBarItem(
            onBackClick = {}
        )
    }
}