package com.example.school

sealed class Screens(val screen: String) {
   data object Home: Screens( "Home")
    data object About: Screens( "About")
    data object Gallery: Screens(  "Gallery")
}