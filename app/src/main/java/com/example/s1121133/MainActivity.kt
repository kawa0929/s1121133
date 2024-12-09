package com.example.s1121133

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.s1121133.ui.theme.S1121133Theme
import androidx.compose.ui.platform.LocalContext
import android.app.Activity
import androidx.compose.ui.geometry.Offset




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S1121133Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}





@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column (Modifier.background(Color(0xff95fe95)).fillMaxSize()){
        Alignment.CenterHorizontally
            Text(
                text = "2024期末上機考(資管二A許閔慈)",
                modifier = modifier
            )
            Image(
                painter = painterResource(id = R.drawable.class_a),
                contentDescription = "圖片",
            )
        Text(
            text = "2024期末上機考(資管二A許閔慈)",
            modifier = modifier
        )

        Text(
            text = "您的成績 0 分",
            modifier = modifier
        )

        val activity = (LocalContext.current as? Activity)
        Box (
            contentAlignment = Alignment.BottomEnd
        ){
            Button(
                onClick = {
                    activity?.finish()
                }
            ) {
                Text("結束App")
            }
        }


    }

    }




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    S1121133Theme {
        Greeting("Android")
    }
}