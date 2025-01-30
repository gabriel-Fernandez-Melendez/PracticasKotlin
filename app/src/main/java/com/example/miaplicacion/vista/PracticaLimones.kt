package com.example.miaplicacion.vista

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.miaplicacion.CuadrosLayout
import com.example.miaplicacion.R
import com.example.miaplicacion.ui.theme.MiAplicacionTheme
import kotlin.random.Random

/*@Composable
fun PantallaDeLimonada(modifier: Modifier = Modifier) { // el centrado del texto se hace dento de la propia collum
    var veces: MutableIntState = rememberSaveable() { mutableIntStateOf(Random.nextInt(1, 4)) }
    Column(
        modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .size(60.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            text = "Limonade", fontWeight = FontWeight.Bold, fontSize = 40.sp,
        )
        when (veces.value) {
            1 -> Column(
                modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Button(onClick = { veces.value++ }) {
                    Image(
                        painter = painterResource(id = R.drawable.lemon_tree),
                        contentDescription = "rt"
                    )
                }
                Text(text = "click en el arbol para cojer el limon")
            }

            2 -> Column(
                modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Button(onClick = { veces.value++ }) {
                    Image(
                        painter = painterResource(id = R.drawable.lemon_squeeze),
                        contentDescription = "rt"
                    )
                }
                Text(text = "click en el limon para hacer el limonada")
            }

            3 -> Column(
                modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Button(onClick = { veces.value++ }) {
                    Image(
                        painter = painterResource(id = R.drawable.lemon_drink),
                        contentDescription = "rt"
                    )
                }
                Text(text = "click en la limonada para beberla")
            }

            4 -> Column(
                modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Button(onClick = { veces.value = 1 }) {
                    Image(
                        painter = painterResource(id = R.drawable.lemon_restart),
                        contentDescription = "rt"
                    )
                }
                Text(text = "click en eñ vaso para volver al arbol")
            }
        }
    }
}*/

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview2r() {
   // Limonada(Modifier)
    }


