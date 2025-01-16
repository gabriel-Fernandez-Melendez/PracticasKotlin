package com.example.miaplicacion.componente

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miaplicacion.CuadrosLayout
import com.example.miaplicacion.R
import com.example.miaplicacion.ui.theme.MiAplicacionTheme

//card es uno de los formatos que nos da jetpack compose
//alt+enter exporta rapido los paquetes necesarios
@Composable
fun Tarjeta(modifier: Modifier=Modifier){
    Card (Modifier.fillMaxWidth().padding(20.dp)) {
        Row {
           Image(painter = painterResource(id = R.drawable.principado_de_asturias), contentDescription = "sisi")// la descripcion de a imagen es indispensable
            Column {
                    Text(
                        text = "Principado de Asturias"
                    )

                Text(
                    text = "Oviedo"
                )
            }
    }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MiAplicacionTheme {
        Tarjeta()
    }
    }