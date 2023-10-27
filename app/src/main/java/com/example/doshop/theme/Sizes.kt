package com.example.doshop.theme

import androidx.compose.ui.unit.dp

interface Sizes {
    object Icons
    object Dividers
    object Tab
}

// Icons
inline val Sizes.Icons.ExtraLarge
    get() = 60.dp
inline val Sizes.Icons.Large
    get() = 48.dp
inline val Sizes.Icons.Medium
    get() = 36.dp
inline val Sizes.Icons.Default
    get() = 24.dp
inline val Sizes.Icons.Small
    get() = 18.dp
inline val Sizes.Icons.Tiny
    get() = 12.dp
inline val Sizes.Icons.Nano
    get() = 8.dp

// Dividers
inline val Sizes.Dividers.Default
    get() = 1.dp

// Tab
inline val Sizes.Tab.Default
    get() = 28.dp
inline val Sizes.Tab.Large
    get() = 36.dp
inline val Sizes.Tab.IconHeight
    get() = 18.dp