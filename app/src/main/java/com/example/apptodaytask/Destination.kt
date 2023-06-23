package com.example.apptodaytask

sealed class Destination(var route: String){
    object  ScreenFirst: Destination(route = "ScreenFirst")
    object ScreenSecond: Destination(route = "ScreenSecond" )

}
