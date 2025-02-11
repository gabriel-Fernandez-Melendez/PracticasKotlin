package com.example.miaplicacion.vista

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.miaplicacion.componente.botonSimple

@Composable
fun DialogoSimple(modifier: Modifier =Modifier){
    Dialog(onDismissRequest = {}) {
        Card(Modifier.fillMaxWidth().height(150.dp).padding(18.dp),
            shape = RoundedCornerShape(16.dp)
        )
        {
            Text(text = "Dialogo simple",
                modifier = Modifier.fillMaxSize().wrapContentSize(Alignment.Center),
                textAlign = TextAlign.Center)
        }
    }
}

@Composable
fun DialogoAlerta(modifier: Modifier =Modifier){
    AlertDialog(onDismissRequest = { Log.i("fuera","fuera")},
        confirmButton = {
            TextButton(onClick = {Log.i("Aceptado","Aceptado")})
            {
                Text("Si")
            }
        },
        dismissButton = {
            TextButton(onClick = {Log.i("Cancelado","Cancelado")})
            {
                Text("No")
            }
        },
        icon = {
            Icon(imageVector = Icons.Default.Info, contentDescription = "Informacion", tint = Color.Blue)
        },
        title = { Text("Alerta", color = Color.Red) },
        text = { Text(text = "Deseas continuar?", textAlign = TextAlign.Center) }// no lo centra correctamente aun que lo declares
        )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreviewDialogos() {
    DialogoAlerta(Modifier)
}