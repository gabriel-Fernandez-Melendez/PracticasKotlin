package com.example.miaplicacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MiAplicacionTheme {
        Greeting("Android")
    }
}