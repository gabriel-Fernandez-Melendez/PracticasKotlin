package com.example.miaplicacion.ModeloMVVM.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.miaplicacion.ModeloMVVM.viewmodel.ContadorViewModel

@Composable
fun Contador(viewModel: ContadorViewModel){ //ojo , este argumento llama a la clase que viene de contador y no de view model directo
   val contador by viewModel.contador.collectAsState()
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ){ //Atento a las llaves!!!!!!!!!!
        Text(text = contador.toString(), fontWeight = FontWeight.Bold, fontSize = 25.sp)
        FloatingActionButton(
            onClick = {viewModel.contar()}, //llamada a la funcion para que cuente
            modifier = Modifier.align(Alignment.BottomEnd).padding(15.dp)
        ) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "icono del boton", tint = Color.Blue)
        }

    }
}