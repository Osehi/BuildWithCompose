package com.example.clockinappcompose

sealed class Screen(val route: String) {

    object HomeScreen: Screen(route = "HomeScreen")
    object DisplayScreen: Screen(route = "DisplayScreen")
    object GuestDetailScreen: Screen(route = "GuestDetailScreen")
}
