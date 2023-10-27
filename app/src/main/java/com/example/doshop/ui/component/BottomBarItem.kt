package com.example.doshop.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.doshop.preview.DevicePreviews
import com.example.doshop.theme.Blue
import com.example.doshop.theme.DoShopTheme
import com.example.doshop.theme.White

data class BottomBarItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val hasNews: Boolean
)

@OptIn(ExperimentalMaterial3Api::class)
/**@Composable
fun BottomBarItem(
    onBackClick: () -> Unit
) {
    val items = listOf(
        BottomNav
    )
    Scaffold{
        bottomBar = {
            NavigationBar {

            }
        }
    }
}*/

@DevicePreviews
@Composable
private fun BottomBarItemPreview() {
    DoShopTheme {
        //BottomBarItem()
    }
}