package com.gautam.novaai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.gautam.novaai.ui.screens.HomeScreen
import com.gautam.novaai.ui.theme.NovaAITheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            NovaAITheme {
                HomeScreen()
            }
        }
    }
}