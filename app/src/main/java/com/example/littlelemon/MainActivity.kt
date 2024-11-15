package com.example.littlelemon

import LoginScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.littlelemon.ui.theme.LittleLemonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val navController = rememberNavController()

            LittleLemonTheme {
                NavHost(navController = navController, startDestination = Routes.LoginScreen, builder ={
                    composable(Routes.LoginScreen){
                        LoginScreen(navController)
                    }
                    composable(Routes.HomeScreen){
                        HomeScreen(navController)
                    }
                } )
            }

        }

    }
}
