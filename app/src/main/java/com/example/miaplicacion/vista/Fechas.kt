package com.example.miaplicacion.vista

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.DatePicker
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Midatapicker(modifier: Modifier =Modifier){
    val estadodelpicker= rememberDatePickerState()
    Column(modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        DatePicker(
            state = estadodelpicker
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MidatapickerModificado(modifier: Modifier =Modifier){
    val estadodelpicker= rememberDatePickerState()
    val selected= estadodelpicker.selectedDateMillis?.let { converMillisFecha(it) }
    Column(modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        DatePicker(
            state = estadodelpicker
        )
        if(!selected.isNullOrEmpty()){
            Text(text = "Fecha seleccionada $selected")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MidatapickerModificadoTextfield(modifier: Modifier =Modifier){
    val estadodelpicker= rememberDatePickerState()
    val selected= estadodelpicker.selectedDateMillis?.let { converMillisFecha(it) } //?.let  comprueba que el campo  no sea null y tenga algun  tipo de dato pero  no  necesariamente  el que funciona
    Column(modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(value = selected ?: "",
            onValueChange = {}  )
    }
}

fun  converMillisFecha(millis: Long): String{
val formatter = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
    return formatter.format(Date(millis))
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreviewFechas() {
    MidatapickerModificado(Modifier)
}