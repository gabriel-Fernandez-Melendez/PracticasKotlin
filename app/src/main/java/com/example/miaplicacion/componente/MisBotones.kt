package com.example.miaplicacion.componente

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun botonSimple(modifier: Modifier=Modifier){
    Button(onClick = {}, //se que vacio de momento
    modifier = modifier
    ) {
        Text(
            text = "primerBoton",
            fontSize = 10.sp //era con sp no con dp 
        )
    }
}