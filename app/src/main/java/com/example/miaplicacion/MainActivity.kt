package com.example.miaplicacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.miaplicacion.ui.theme.MiAplicacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiAplicacionTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


//lo mas usual es que utilicemos los estilos esternalizados para poder usar esto
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        //importante , al aplicar estos cambios no es important el orden (con los modficadors sin es importante)los modficadores modifican la estructura de la app
        text = "\n\n Hello $name!",
        //insetamos una de las opcciones que tiene text en jetpack compose
        fontSize = 20.sp, //recomendable usar sp por que son pixeles escalables
        fontWeight = FontWeight.Bold,//todos estos metodos son kotlin nativo en la capa mas baja
        fontStyle = FontStyle.Italic,
        color = Color.Red,
        textDecoration = TextDecoration.Underline,
        textAlign = TextAlign.Center, // no se cambia por que el contenedor es del tamaño del texto no el de una caja
        modifier = modifier
            .background(color = Color.Blue)
            .padding(all = 15.dp), //esto puede hacerse sin declarar el color = (auqi el orden si es muy importante)
    )
}

@Composable
//añadimos un  argumento mas a la funcion para que salga el segundo texto
fun PrimeraFuncion(mensaje: String, from: String, modifier: Modifier = Modifier) {
    //este modifier en columna indica que ocupe toda la pantalla del movil
    Column(
        modifier
            .fillMaxSize()
            .padding(8.dp), verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = mensaje,
            //cambiamos el alto para que no moleste la camara
            fontSize = 60.sp,
            lineHeight = 80.sp,
            modifier = modifier,

            )
        //hacemos otro texto para pasarlo como parametro
        Text(
            text = from,
            fontSize = 20.sp,
            modifier = modifier.align(Alignment.End),
            textAlign = TextAlign.Right

        )
    }

}

//hacemos una  nueva funcion de composicion
@Composable
fun FuncionImagen(mensaje: String, from: String, modifier: Modifier = Modifier) {
    Box {
        Image(
            painter = painterResource(id = R.drawable.androidparty),
            contentDescription = "locura",
            contentScale = ContentScale.Crop,
            alpha = 0.5f
        )
        //hacemos una llamada a la funcion anterior y se superpone
        PrimeraFuncion("felicidades gabriel", "from mario")
    }


}

//creamos una funcion para los cuadrados
@Composable
fun CuadrosLayout(modifier: Modifier = Modifier) {
    //amadimos el modificador a la columna para que ocupetodo
    //importante :  el peso weith es el encargado de cuanto ocupa ese layout en la pantalla
    Column(Modifier.fillMaxSize()) {
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(
                        Color(0xFFEADDFF)
                    )
                    .padding(16.dp),
                contentAlignment = Alignment.Center

            ) {
                Column {
                    Text(
                        text = "Text composable",
                        fontWeight = FontWeight.Bold,
                        modifier = modifier.padding(bottom = 16.dp)
                    )
                    Text(
                        text = "cmas texto de como  funcona esto",
                        textAlign = TextAlign.Justify,
                        modifier = modifier

                    )
                }

            }
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(
                        Color(0xFFD0BCFF)
                    )
                    .padding(16.dp),  //nota importante una coma al final de los modifier(para alinear es content aligment no padding)
                contentAlignment = Alignment.Center
            ) {
                Column {
                    Text(
                        text = "Text composable",
                        fontWeight = FontWeight.Bold,
                        modifier = modifier.padding(bottom = 16.dp)
                    )
                    Text(
                        text = "cmas texto de como  funcona esto",
                        textAlign = TextAlign.Justify,
                        modifier = modifier

                    )
                }
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(
                        Color(0xFFB69DF8)
                    )
                    .padding(16.dp)
            ) {
                Column {
                    Text(
                        text = "Text composable",
                        fontWeight = FontWeight.Bold,
                        modifier = modifier.padding(bottom = 16.dp)
                    )
                    Text(
                        text = "cmas texto de como  funcona esto",
                        textAlign = TextAlign.Justify,
                        modifier = modifier

                    )
                }
            }
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(
                        Color(0xFFF6EDFF)
                    )
                    .padding(16.dp)
            ) {
                //recordar añadir el padding
                TextoCaja("tituloooo","asi es como  podemos declarar esta caja")
            }
        }
    }
}
//esta funcion servivia para optimizar el codigo en las cajas
@Composable
fun TextoCaja(titulo : String ,descripcion : String, modifier: Modifier= Modifier){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = titulo,
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(bottom = 16.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = descripcion,
            textAlign = TextAlign.Justify,
            modifier = modifier

        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MiAplicacionTheme {
        //Greeting("Android")
        //ponemos la funcipon que hemos creado (primera funcion)
        //PrimeraFuncion("felicidades gabriel", "from mario")
        //metemos la funcion de la imagen
        //FuncionImagen("felicidades gabriel", "from mario")
        //metemos la funcion de los cuadros
        CuadrosLayout()
    }


}