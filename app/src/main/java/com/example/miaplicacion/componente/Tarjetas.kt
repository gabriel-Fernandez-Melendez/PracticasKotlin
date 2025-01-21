package com.example.miaplicacion.componente

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.miaplicacion.CuadrosLayout
import com.example.miaplicacion.R
import com.example.miaplicacion.ui.theme.MiAplicacionTheme

//card es uno de los formatos que nos da jetpack compose
//alt+enter exporta rapido los paquetes necesarios
@Composable
fun Tarjeta(modifier: Modifier = Modifier) {
    Card(
        Modifier
            .fillMaxWidth()
            .padding(20.dp)
             )
    {
        Row {
            Image(
                painter = painterResource(id = R.drawable.principado_de_asturias),
                contentDescription = "sisi"
            )// la descripcion de a imagen es indispensable
            Column {
                Text(
                    text = "Principado de Asturias",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(5.dp)

                )

                Text(
                    text = "Oviedo",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(5.dp)
                )
            }
        }
    }
}

@Composable
fun Tarjeta1(modifier: Modifier = Modifier) {
    Card(
        Modifier
            .fillMaxWidth()
            .padding(20.dp),
            border = BorderStroke(5.dp, Color.Blue) // asi le ponemos un  borde de color a la tarjeta
    )
    {
        Row {
            Image(
                painter = painterResource(id = R.drawable.principado_de_asturias),
                contentDescription = "sisi"
            )// la descripcion de a imagen es indispensable
            Column {
                Text(
                    text = "Principado de Asturias",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(5.dp)

                )

                Text(
                    text = "Oviedo",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(5.dp)
                )
            }
        }
    }
}

@Composable
fun Tarjeta2(modifier: Modifier = Modifier) {
    Card(
        Modifier
            .fillMaxWidth()
            .padding(20.dp),
        elevation = CardDefaults.cardElevation(5.dp)// asi le ponemos un  borde de color a la tarjeta
    )
    {
        Row {
            Image(
                painter = painterResource(id = R.drawable.principado_de_asturias),
                contentDescription = "sisi"
            )// la descripcion de a imagen es indispensable
            Column {
                Text(
                    text = "Principado de Asturias",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(5.dp)

                )

                Text(
                    text = "Oviedo",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(5.dp)
                )
            }
        }
    }
}

@Composable
fun Tarjeta3(modifier: Modifier = Modifier) {
    Card(
        Modifier
            .fillMaxWidth()
            .padding(20.dp),
        elevation = CardDefaults.cardElevation(5.dp),
        shape = CircleShape
    )
    {
        Row {
            Image(
                painter = painterResource(id = R.drawable.principado_de_asturias),
                contentDescription = "sisi"
            )// la descripcion de a imagen es indispensable
            Column {
                Text(
                    text = "Principado de Asturias",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(5.dp)

                )

                Text(
                    text = "Oviedo",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(5.dp)
                )
            }
        }
    }
}

@Composable
fun Tarjeta4(modifier: Modifier = Modifier) {
    ElevatedCard (
        Modifier
            .fillMaxWidth()
            .padding(20.dp),
        elevation = CardDefaults.cardElevation(5.dp),
        shape = CircleShape
    ){Row {
    Image(
        painter = painterResource(id = R.drawable.principado_de_asturias),
        contentDescription = "sisi"
    )// la descripcion de a imagen es indispensable
    Column {
        Text(
            text = "Principado de Asturias",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(5.dp)

        )

        Text(
            text = "Oviedo",
            fontSize = 20.sp,
            modifier = Modifier.padding(5.dp)
        )
    }
}
} }






@Composable
fun MisTarjetas(modifier: Modifier = Modifier){
    Column {
        Tarjeta(Modifier)
        Tarjeta1(Modifier)
        Tarjeta2(Modifier)
        Tarjeta3(Modifier)
        Tarjeta4(Modifier)
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MiAplicacionTheme {
        Tarjeta()
    }
}