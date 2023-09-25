package com.example.lab6si.navigation

sealed class AppScreens(val ruta:String){

    object FirstScreen: AppScreens("first_screen")
    object SecondScreen: AppScreens("second_screen")
    object ThirdScreen: AppScreens("third_screen")
}
