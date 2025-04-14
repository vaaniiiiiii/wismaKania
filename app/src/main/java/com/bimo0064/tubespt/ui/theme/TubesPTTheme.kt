package com.bimo0064.tubespt.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun TubesPTTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        // kamu bisa tambah colorScheme dan typography kalau sudah ada
        content = content
    )
}
