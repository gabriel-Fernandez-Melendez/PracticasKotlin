package com.example.miaplicacion.vista

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miaplicacion.componente.botonSimple

//esta funcion funciona y cuenta las veces que se pulsa un  boton
@Composable
fun Pulsador(modifier: Modifier=Modifier){

    Column(

        modifier.fillMaxSize(), //indica que ocupa toda la pantalla
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
            var contador: MutableIntState = rememberSaveable  { mutableIntStateOf( 0) } //hay qye ver muy  bien el diferente tipo  de metodo
    Text(text = "se a pulsado ${contador.value} ")
       Button(onClick = {contador.value++}) {
           Spacer(modifier.size(15.dp))

           Text(text = "pulsame")
       }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview2() {
    Pulsador(Modifier)
}