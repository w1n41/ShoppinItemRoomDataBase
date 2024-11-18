package com.example.shoppinitemroomdatabase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.shoppinitemroomdatabase.screens.Navigation
import com.example.shoppinitemroomdatabase.ui.theme.ShoppinItemRoomDataBaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShoppinItemRoomDataBaseTheme {
                Navigation()
            }
        }
    }
}

