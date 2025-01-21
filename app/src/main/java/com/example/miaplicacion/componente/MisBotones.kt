package com.example.miaplicacion.componente

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.miaplicacion.ui.theme.MiAplicacionTheme

@Composable
fun botonSimple(modifier: Modifier=Modifier){
    Button(onClick = {}, //se que vacio de momento
    modifier = modifier,
        colors = ButtonDefaults.buttonColors(contentColor = Color.Blue, containerColor =    Color.Red)
    ) {
        Text(
            text = "primerBoton",
            fontSize = 30.sp //era con sp no con dp
        )
    }
}

@Composable
fun botones(){

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview2() {
    botonSimple(Modifier)
}