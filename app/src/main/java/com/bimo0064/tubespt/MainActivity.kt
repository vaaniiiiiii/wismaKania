package com.bimo0064.tubespt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.bimo0064.tubespt.ui.navigation.AppNavGraph
import com.bimo0064.tubespt.ui.theme.TubesPTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppEntryPoint()
        }
    }
}

@Composable
fun AppEntryPoint() {
    TubesPTTheme {
        val navController = rememberNavController()
        AppNavGraph(navController = navController)
    }
}
