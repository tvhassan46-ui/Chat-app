package com.example.chatapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.chatapp.ui.theme.ChatAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            ChatAppTheme { // A theme applied to the app
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Hello, Jetpack Compose!")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Welcome to $name")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ChatAppTheme {
        Greeting("Android")
    }
}