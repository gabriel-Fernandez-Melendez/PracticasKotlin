package com.example.miaplicacion.vista

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
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
        var peso by remember { mutableStateOf("") }
        var altura by remember { mutableStateOf("") }
        var rel by remember { mutableStateOf("") }//el importe ocurre aqui  y no en el it de la linea de abajo
        var variable by remember {  mutableStateOf("") }
        var perimetro by remember {  mutableStateOf("") }
        var perimetro_String by remember {  mutableStateOf("") }

        TextField(value =peso, onValueChange = {peso = it}, label = { Text("Introduce tu peso")})
        Spacer( modifier.size(30.dp))
        TextField(value = altura, onValueChange = {altura = it}, label =  { Text("Introduce tu altura")})
        Spacer( modifier.size(20.dp))

        Spacer( modifier.size(20.dp))
        Text(text = "su IMC esta en : $rel", fontSize = 10.sp)

        Spacer(modifier.size(30.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            for (result in listOf("Hombre","Mujer")){
                Row(verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(selected = variable == result, onClick = {variable=result}) //forma difernete de ejecutar el bucle
                    Text(text = result) }


            }
        }
        Spacer(modifier.size(20.dp))
        TextField(value =perimetro, onValueChange = {perimetro = it}, label = { Text("Introduce tu perimetro")})
        Spacer( modifier.size(20.dp))
        Text(text = "su Riesgo esta en : $perimetro_String", fontSize = 10.sp)
        Spacer(modifier.size(20.dp))
        Button(onClick = {rel=PesoPorAltura(altura.toDouble(),peso.toDouble());perimetro_String=PesoPorAlturaPerimetro(perimetro.toInt(),variable) },) {
            Text(
                text = "Calcular",
                fontSize = 10.sp
            )
        }
    }
}

fun PesoPorAltura(altura:Double,peso:Double):String {
    var imc =peso/(altura*altura)
     return when(imc){
        in 1.0..16.0 -> "Delgadez severa"
        in 16.0..17.0-> "Delgadez moderada"
        in 17.0..18.5-> "Delgadez leve"
        in 18.5..25.0-> "Delgadez leve"
        in 25.0..30.0-> "Delgadez leve"
        in 30.0..35.0-> "Delgadez leve"
        in 35.0..40.0-> "Delgadez leve"
        40.0-> "Obecidad morbida"
         else -> {" "}
     }

}
fun PesoPorAlturaPerimetro(perimetro:Int,genero:String):String {
    var riesgo:String ="prueba"
    when(genero){
        "Mujer"->  when(perimetro){
            in 0..80 -> riesgo="Normal "
            in 81..88-> riesgo="Riesgo alto "
            in 88..1200-> riesgo="Riesgo muy alto"
            else -> {" "}
        }
        "Hombre"->  when(perimetro){
        in 0..94 -> riesgo="Normal "
        in 95..102-> riesgo="Riesgo alto "
        in 88..1200-> riesgo="Riesgo muy alto"
        else -> {" "}
    }

    }
    return riesgo
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreviewPracticaCalculadora() {
    Calculadora(Modifier)
}