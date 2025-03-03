package com.example.miaplicacion.Navegacion.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@Composable
fun Pantalla1(control_nav: NavHostController){
    Box(modifier = Modifier.fillMaxSize().background(Color.Yellow)){
        Button(onClick = {control_nav.navigate("Pantalla2")},
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text(text = "Pantalla 2")
        }
    }
}