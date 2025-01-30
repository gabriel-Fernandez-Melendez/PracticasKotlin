package com.example.miaplicacion.vista

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Calculadora(modifier: Modifier=Modifier){
    Column( modifier
        .fillMaxWidth().fillMaxHeight().size(60.dp), horizontalAlignment = Alignment.CenterHorizontally){
        Row(modifier.fillMaxWidth().background(Color(130,66,171)).height(45.dp)) {
            Text(" ")
        }
        Spacer( modifier.size(12.dp)) //esto te permite alejar componentes entre ellos
        Text(text ="Indice de Masa Corporal" ,fontSize = 30.sp)
        var peso by remember { mutableDoubleStateOf(0.0) }
        var altura by remember { mutableDoubleStateOf(0.0)} //el importe ocurre aqui  y no en el it de la linea de abajo
       // TextField(value = peso, onValueChange = {peso = it}, label = {"Introduce tu peso"})
        Spacer( modifier.size(30.dp))
       // TextField(value = "Introduce tu altura" , onValueChange = {altura = it}, label = {"Introduce tu peso"})
        Spacer( modifier.size(20.dp))
        Button(onClick = {PesoPorAltura(altura,peso)},) { Text(
            text = "Calcular",
            fontSize = 10.sp
        )
        }
        Spacer( modifier.size(20.dp))
        Text(text = "se ve", fontSize = 30.sp)
    }
}

fun PesoPorAltura(altura:Double,peso:Double){
    var imc =peso*altura*altura
    when(peso){
        in 1.0..16.0 -> "Delgadez severa"
        in 16.0..17.0-> "Delgadez moderada"
        in 17.0..18.5-> "Delgadez leve"
        in 18.5..25.0-> "Delgadez leve"
        in 25.0..30.0-> "Delgadez leve"
        in 30.0..35.0-> "Delgadez leve"
        in 35.0..40.0-> "Delgadez leve"
        40.0-> "Obecidad morbida"
    }

}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreviewPracticaCalculadora() {
    Calculadora(Modifier)
}