package com.example.clockinappcompose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun GuestDetailScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "GuestDetailScreen",
            color = Color.Blue,
            fontSize = 20.sp
        )

    }
}

@Composable
@Preview(showBackground = true)
fun GuestDetailScreenPreview() {
    GuestDetailScreen()
}