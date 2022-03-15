package com.example.navdemov2

sealed class Screen(val route:String)
{
    object Login_Screen:Screen("Login_Screen")
    object Profile_Screen:Screen("Profile_Screen")
    object Post_Screen:Screen("Post_Screen")

}