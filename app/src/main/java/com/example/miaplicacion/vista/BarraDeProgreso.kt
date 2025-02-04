package com.example.miaplicacion.vista


import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.miaplicacion.componente.RadioButonConfor
import kotlinx.coroutines.delay

@Composable
fun BarraDeProgresoIndeterminado(modifier: Modifier =Modifier){
Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
    Text("Sincronizando Datos")
    Spacer(modifier.size(30.dp))
    LinearProgressIndicator(
        color = Color(33,150,243),
        trackColor = Color(0, 255, 0, 255),
       modifier = Modifier.fillMaxWidth(0.9f).size(30.dp),      //esta linea cambia el tamaño de la barra
        strokeCap = StrokeCap.Round
        //esta linea cambia el tamaño de la barra
    ) //asi se llama al atributo de una barra de carga indeterminada

}
}

@Composable
fun BarraCircular(modifier: Modifier =Modifier){
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Sincronizando Datos")
        Spacer(modifier.size(30.dp))
        CircularProgressIndicator(
            color = Color(33,150,243),
            trackColor = Color(0, 255, 0, 255),
            modifier = Modifier.fillMaxWidth(0.4f).size(10.dp),      //esta linea cambia el tamaño de la barra
            strokeCap = StrokeCap.Round,
            strokeWidth = 20.dp //esto te deja asignar el grosor del circulo
            //esta linea cambia el tamaño de la barra
        ) //asi se llama al atributo de una barra de carga indeterminada

    }
}

@Composable
fun BarraDeProgresoDetermianda(modifier: Modifier =Modifier){
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        var progreso by remember { mutableStateOf(0.0f) }
        LaunchedEffect((true)  ) {
            for(i in 0 ..100 step 10){
                delay(300)
                progreso =i/100f
            }
        }                                       //OJO esta es la forma de hacer una operacion dentro de un  string
        Text("Sincronizando Datos ${(progreso*100)} ") //muestra el avanse de la barra que se devidie por partes gracias al step
        Spacer(modifier.size(30.dp))
         //asi se llama al atributo de una barra de carga indeterminada
       LinearProgressIndicator(progress = progreso ,color = Color(33,150,243),
           trackColor = Color(0, 255, 0, 255))
    }
}

@Composable
fun BarraDeProgresoDetermiandaAnimacion(modifier: Modifier =Modifier){
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        var progreso by remember { mutableStateOf(0.0f) }
        LaunchedEffect((true)  ) {
            for(i in 0 ..100 step 10){
                delay(300)
                progreso =i/100f
            }
        }
        val animacion by animateFloatAsState(targetValue = progreso,
            animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec)//OJO esta es la forma de hacer una operacion dentro de un  string
        Text("Sincronizando Datos ${(progreso*100)} ") //muestra el avanse de la barra que se devidie por partes gracias al step
        Spacer(modifier.size(30.dp))
        //asi se llama al atributo de una barra de carga indeterminada
        LinearProgressIndicator(progress = animacion ,color = Color(33,150,243), //hay que poner la variable de la animacion en el argumento de process
            trackColor = Color(0, 255, 0, 255))
    }
}

@Composable
fun BarraCircularConBox(modifier: Modifier =Modifier){ //revisar  esta funcion
    Box(modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        var progreso by remember { mutableStateOf(0.0f) }
        LaunchedEffect((true)) {
            for(i in 0 ..100 step 10){
                delay(300)
                progreso =i/100f
            }
        }
        var progresoCircular by remember { mutableStateOf(0.0f) }
        CircularProgressIndicator(progress = progresoCircular,
           color = Color(33,150,243), //hay que poner la variable de la animacion en el argumento de process
            trackColor = Color(0, 255, 0, 255))

    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreviewradiobuttond() {
    BarraCircularConBox(Modifier)
}