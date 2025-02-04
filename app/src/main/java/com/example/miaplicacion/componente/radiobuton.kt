package com.example.miaplicacion.componente

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
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
fun RadioButon(modifier: Modifier =Modifier){ //lo que ha cambiado con este cambio es que la forma de comprobar el contenido del programa es diferente
    var efectivo by remember {  mutableStateOf(false) }
    var variable by remember {  mutableStateOf("") }
    Column( modifier
        .fillMaxWidth().fillMaxHeight().size(60.dp), horizontalAlignment = Alignment.CenterHorizontally , verticalArrangement = Arrangement.Center){
        Spacer(Modifier.size(30.dp))
        Text("efectivo o tarjeta", fontSize = 30.sp)
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = variable == "efectivo", onClick = {variable="efectivo"}) //forma difernete de ejecutar el bucle
            Text(text = "efectivo") }
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = variable =="tarjeta", onClick = {variable="tarjeta"})
            Text(text = "tarjeta") }
        if(variable.equals("efectivo")){
            Text(text = "efectivo")
        }
        if(variable.equals("tarjeta")){
            Text(text = "tarjeta")
        }

    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreviewradiobuttond() {
    RadioButon(Modifier)
}