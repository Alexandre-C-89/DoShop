package com.example.doshop.onboarding

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.doshop.preview.DevicePreviews
import com.example.doshop.theme.DoShopTheme
import com.example.doshop.ui.component.TopAppBarItem

@Composable
fun OnboardingRoute(

) {
    OnboardingScreen(
        onBackClick = {}
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun OnboardingScreen(
    onBackClick: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBarItem {

            }
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {

            }
        }
    }
}

@DevicePreviews
@Composable
private fun OnboardingScreenPreview() {
    DoShopTheme {
        OnboardingScreen(
            onBackClick = {}
        )
    }
}