package com.example.lab6si.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab6si.screen.FirstScreen
import com.example.lab6si.screen.FourthScreen
import com.example.lab6si.screen.SecondScreen
import com.example.lab6si.screen.ThirdScreen

@Composable
fun AppNavigation(){
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.FirstScreen.ruta){
        composable(route=AppScreens.FirstScreen.ruta){
            FirstScreen(navController)
        }
        composable(route=AppScreens.SecondScreen.ruta){
            SecondScreen(navController)
        }
        composable(route=AppScreens.ThirdScreen.ruta){
            ThirdScreen(navController)
        }
        composable(route=AppScreens.FourthScreen.ruta){
            FourthScreen(navController)
        }
        


    }

}