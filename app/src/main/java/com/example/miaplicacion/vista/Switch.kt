package com.example.miaplicacion.vista

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miaplicacion.Data.Botonactivo


@Composable
fun MiSwitch(modifier: Modifier =Modifier){
    var check by remember { mutableStateOf(true) }
    Column(modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Switch(checked = check, onCheckedChange = {check=!check},
            thumbContent = {if(check)
            Icon(
                imageVector = Icons.Filled.Done, //aqui asignamos el icono
                contentDescription = "activado"
            )}//asi se hace el switch de forma correcta

            )
    }
}

//@Composable
//fun MiSwitchPractica(modifier: Modifier =Modifier){
//    var necesarias by remember { mutableStateOf(true) }
//    var estadisticas by remember { mutableStateOf(true) }
//    var marketing by remember { mutableStateOf(true) }
//
//    Column(modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//
//    ) {
//        Text(text = "Cookies")
//        for (result in mutableListOf<Botonactivo>(Botonactivo("necesarias",true,necesarias ))){
//            Row {
//            Text(text = "${result.nombre}",Modifier.padding(top = 15.dp, end = 10.dp))
//            Switch(checked = ${result.check}, onCheckedChange = {necesarias=!necesarias })
//                thumbContent = {if(necesarias)
//                    Icon(
//                        imageVector = Icons.Filled.Done, //aqui asignamos el icono
//                        contentDescription = "activado"
//                    )}//asi se hace el switch de forma correcta
//
//            ) }}
//
//    }
//}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreviewSwitch() {
   // MiSwitchPractica(Modifier)
}