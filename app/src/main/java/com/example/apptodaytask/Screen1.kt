package com.example.apptodaytask


import android.annotation.SuppressLint
import android.widget.ImageView
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun BemVindo(navController:NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                modifier = Modifier.statusBarsPadding(),
                backgroundColor = Color.Blue,
                contentColor = Color.White

            ) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "Bem-Vindo a Calculadora")
                } }
        }


    ) {
        // Screen content
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,

            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()

        ) {

            Text(text = "Bem-Vindo a Calculadora")
            Button(onClick = {navController.navigate(Destination.ScreenSecond.route)}) {
                Text(text = "Next")
            }

        }
    }
}