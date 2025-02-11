package com.example.miaplicacion.vista

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun slider(modifier: Modifier =Modifier){
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally)
    {
        slidersimple()
        slidersimpleColor()
        slidersimpleSteps()
        SliderRango()
    }
}

@Composable
fun slidersimple(modifier: Modifier = Modifier){
    var posicion by remember { mutableStateOf(0f) }
    Row (Modifier.fillMaxWidth(0.8f))
    {
        Text(text = "cuanto dinero necesitas", textAlign = TextAlign.Left, modifier = Modifier.weight(0.8f))
        Text(text = "${((posicion *54000)+6000).toInt()} euros", textAlign = TextAlign.Right, modifier = Modifier.weight(0.3f))
    }
Slider(
    value = posicion, onValueChange = {posicion=it}, modifier = Modifier.fillMaxWidth(0.8f)
)

}
@Composable
fun slidersimpleColor(modifier: Modifier = Modifier){
    var posicion by remember { mutableStateOf(0f) }
    Row (Modifier.fillMaxWidth(0.8f))
    {
        Text(text = "cuanto dinero necesitas", textAlign = TextAlign.Left, modifier = Modifier.weight(0.8f))
        Text(text = "${((posicion *54000)+6000).toInt()} euros", textAlign = TextAlign.Right, modifier = Modifier.weight(0.3f))
    }
    Slider(
        value = posicion, onValueChange = {posicion=it}, modifier = Modifier.fillMaxWidth(0.8f),
        colors = SliderDefaults.colors(thumbColor = Color.Red, activeTrackColor = Color.Green)
    )

}

@Composable
fun SliderRango(modifier: Modifier = Modifier){
    var rangoPrecio by remember { mutableStateOf(0f..100f) }
    var selec by remember { mutableStateOf(rangoPrecio ) }
    Row (Modifier.fillMaxWidth(0.8f)){
        Text(text = "rango de precios  ",
            textAlign = TextAlign.Left,
            modifier = Modifier.weight(0.7f))
        Text(text = "${(rangoPrecio.start).toInt()} - ${(rangoPrecio.endInclusive).toInt()}",
            textAlign = TextAlign.Left,
            modifier = Modifier.weight(0.3f))
    }
    RangeSlider(
        value = rangoPrecio,
        onValueChange = {rangoPrecio=it},
        onValueChangeFinished = {selec =rangoPrecio},
        valueRange = 0f..100f,
        steps = 9,
        enabled = true,
        modifier = Modifier.fillMaxWidth(0.8f)
    )
}
@Composable
fun slidersimpleSteps(modifier: Modifier = Modifier){
    var posicion by remember { mutableStateOf(0f) }
    Row (Modifier.fillMaxWidth(0.8f))
    {
        Text(text = "cuanto dinero necesitas", textAlign = TextAlign.Left, modifier = Modifier.weight(0.8f))
        Text(text = "${((posicion *54000)+6000).toInt()} euros", textAlign = TextAlign.Right, modifier = Modifier.weight(0.3f))
    }
    Slider(
        value = posicion, onValueChange = {posicion=it}, modifier = Modifier.fillMaxWidth(0.8f),
        valueRange =  0f ..10f ,
        steps = 9,
    )

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreviewSlider() {
    slider(Modifier)
}