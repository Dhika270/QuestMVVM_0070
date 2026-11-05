package com.example.activity6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.activity6.ui.theme.Activity6Theme // Sesuaikan dengan nama tema di folder ui.theme Anda
import com.example.activity6.view.uicontroller.activity6

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Activity6Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    activity6(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}