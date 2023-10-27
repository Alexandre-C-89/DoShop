package com.example.doshop.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.doshop.preview.DevicePreviews
import com.example.doshop.theme.DoShopTheme

@Composable
fun CardItem(
    
) {
    Card(
        modifier = Modifier
            .width(250.dp)
            .height(100.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.fillMaxHeight()) {
                Text(text = "Title")
                Text(text = "Name")
                Text(text = "Descritpion")
            }
        }
    }
}

@DevicePreviews
@Composable
fun CardItemPreview() {
    DoShopTheme {
        CardItem()
    }
}