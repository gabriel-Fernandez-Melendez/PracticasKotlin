package com.example.miaplicacion.Navegacion.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavHostController
import androidx.compose.ui.Modifier

@Composable
fun Pantalla2(control_nav : NavHostController){
    Box(modifier = Modifier.fillMaxSize()){
        Button(onClick = {control_nav.popBackStack()},
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text(text = "Pantalla 1")
        }
    }
}