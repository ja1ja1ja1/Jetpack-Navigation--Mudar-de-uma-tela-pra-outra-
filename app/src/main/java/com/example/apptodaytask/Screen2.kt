package com.example.apptodaytask

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CalculadoraScreen(navController:NavHostController) {
    var value1 by remember { mutableStateOf("") }
    var value2 by remember { mutableStateOf("") }
    var operator by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }

    Column(Modifier.padding(16.dp)) {
        TextField(
            value = value1,
            onValueChange = { value1 = it },
            label = { Text("Value 1" ) },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number
            ),
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            value = value2,
            onValueChange = { value2 = it },
            label = { Text("Value 1" ) },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number
            ),
            modifier = Modifier.fillMaxWidth()
        )

        Row(Modifier.padding(vertical = 16.dp).align(CenterHorizontally)) {
            Button(onClick = { operator = "+" }, modifier = Modifier.padding(5.dp)){
                Text("+")
            }
            Button(onClick = { operator = "-" }, modifier = Modifier.padding(5.dp)){
                Text("-")
            }
            Button(onClick = { operator = "*" }, modifier = Modifier.padding(5.dp)){
                Text("*")
            }
            Button(onClick = { operator = "/" }, modifier = Modifier.padding(5.dp)){
                Text("/")
            }

            Button(onClick = {
                if(value1.isNotEmpty() && value2.isNotEmpty() && operator.isNotEmpty()) {
                    result = when (operator) {
                        "+" -> (value1.toDouble() + value2.toDouble()).toString()
                        "-" -> (value1.toDouble() - value2.toDouble()).toString()
                        "*" -> (value1.toDouble() * value2.toDouble()).toString()
                        "/" -> (value1.toDouble() / value2.toDouble()).toString()
                        else -> ""
                    }
                }
            }){
                Text("=")
            }

        }
        Button(modifier = Modifier.padding(5.dp), onClick = {
            value1 = ""
            value2 = ""
            operator = ""
            result = ""
        }) {
            Text("Clear")
        }
        if(result.isNotEmpty()){
            Text("Result: $result", Modifier.padding(vertical = 16.dp) )
        }


        Button(onClick = {navController.navigateUp()}) {
            Text(text = "Back")
        }
    }




}





