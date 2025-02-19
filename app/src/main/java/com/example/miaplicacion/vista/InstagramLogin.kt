package com.example.miaplicacion.vista

import android.app.Activity
import android.util.Patterns
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.Pattern


@Composable
fun Login_Instagram(modifier: Modifier = Modifier) {
    var texto_login by remember { mutableStateOf("") }
    var contraseña_bool by remember { mutableStateOf(false) }
    var contraseña by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .background(Color(119, 6, 84, 255))
            .fillMaxWidth()
            .size(46.dp)
    ) { Text(text = "") }
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = modifier.padding(start = 360.dp, top = 50.dp)
    ) { Icon(Icons.Default.Clear, contentDescription = " ", Modifier.clickable { }) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        )
    {


        Image(
            modifier = Modifier.size(200.dp),
            contentDescription = "intagram",
            painter = painterResource(id = com.example.miaplicacion.R.drawable.instagram)
        )
        TextField(value = texto_login,
            onValueChange = { texto_login = it },
            label = { Text("Email") },
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp, end = 8.dp)
        )
        Spacer(modifier.size(20.dp))
        TextField(value = contraseña,
            onValueChange = { contraseña = it },
            label = { Text("Password") },
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp, end = 8.dp)
        )
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = modifier.padding(start = 270.dp, top = 10.dp, end = 8.dp)
        ) { Text(text = "Forgot password?", color = Color.Blue, fontWeight = FontWeight.Bold) }
        Button(
            onClick = { },
            modifier
                .padding(start = 8.dp, end = 8.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            enabled = ValidarLogin(contraseña,texto_login), //esto tengo que cambiarlo
            colors =ButtonDefaults.buttonColors(
                containerColor = Color(34, 111, 224, 255),
                contentColor = Color.White,
                disabledContainerColor = Color(89, 139, 220, 255)
            )

        ) { Text(text = "Login") }//tengo que meter aqui el validar
        //hay que modificar lo que hay  por aqui !!
        Row (Modifier.fillMaxWidth())
        {
            HorizontalDivider(Modifier.width(200.dp).padding(top = 10.dp, start = 8.dp, end = 8.dp))
            Text(text = "OR" , color = Color.Gray, fontSize = 10.sp, modifier = Modifier.padding(top = 6.dp))
            HorizontalDivider(Modifier.width(200.dp).padding(top = 10.dp, end = 8.dp, start = 8.dp))

        }
        Spacer(modifier.size(30.dp))
        Row(Modifier.fillMaxWidth().padding(start = 60.dp)) {
            Image(
                modifier = Modifier.size(40.dp),
                contentDescription = "F",
                painter = painterResource(id = com.example.miaplicacion.R.drawable.facebook_logo),
            )
        }
    }
}


@Composable
fun Login(modifier: Modifier = Modifier){
    Cabecera(Modifier)
    Cuerpo(Modifier)
    //Pie(Modifier) esta funcion que contenia tan solo dos text y in divider no me dio tiempo a modificarla , no carga de forma correcta por no haber usado box como objeto inicial ya que mi contenedor es un column
}
@Composable
fun Cabecera(modifier: Modifier = Modifier){
    val activity = LocalContext.current as Activity
    Column(
        modifier = Modifier
            .background(Color(119, 6, 84, 255))
            .fillMaxWidth()
            .size(46.dp)

    ) { Text(text = "") }
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = modifier.padding(start = 360.dp, top = 50.dp)//.align(Alignment.topcenter) no funciona dentro de una columna, por como lo implemente no puedo poner esta modificacion en concreto
    ) { Icon(Icons.Default.Clear, contentDescription = " ", Modifier.clickable { activity.finish()}) }
}

@Composable
fun Cuerpo(modifier: Modifier = Modifier){
    var texto_login by remember { mutableStateOf("") }
    var contraseña by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .padding(bottom = 30.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        )
    {
        Image(
            modifier = Modifier.size(200.dp),
            contentDescription = "intagram",
            painter = painterResource(id = com.example.miaplicacion.R.drawable.instagram)
        )
        TextField(value = texto_login,
            onValueChange = { texto_login = it },
            label = { Text("Email") },
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp, end = 8.dp)
        )
        Spacer(modifier.size(20.dp))
        TextField(value = contraseña, visualTransformation = if (passwordVisible)
        {
            VisualTransformation.None
        }
        else {
            PasswordVisualTransformation()
        }, trailingIcon ={
            val image = if (passwordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
            IconButton(onClick = { passwordVisible = !passwordVisible }) {
                Icon(imageVector = image, contentDescription = "Toggle password visibility")
            }
        },
            onValueChange = { contraseña = it },
            label = { Text("Password") },
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp, end = 8.dp)
        )
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = modifier.padding(start = 270.dp, top = 10.dp, end = 8.dp)
        ) { Text(text = "Forgot password?", color = Color.Blue, fontWeight = FontWeight.Bold) }
        Button(
            onClick = { },
            modifier
                .padding(start = 8.dp, end = 8.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            enabled = ValidarLogin(contraseña,texto_login), //esto tengo que cambiarlo
            colors =ButtonDefaults.buttonColors(
                containerColor = Color(34, 111, 224, 255),
                contentColor = Color.White,
                disabledContainerColor = Color(89, 139, 220, 255)
            )

        ) { Text(text = "Login") }//tengo que meter aqui el validar
        //hay que modificar lo que hay  por aqui !!
        Row (Modifier.fillMaxWidth())
        {
            HorizontalDivider(Modifier.width(200.dp).padding(top = 10.dp, start = 8.dp, end = 8.dp))
            Text(text = "OR" , color = Color.Gray, fontSize = 10.sp, modifier = Modifier.padding(top = 6.dp))
            HorizontalDivider(Modifier.width(200.dp).padding(top = 10.dp, end = 8.dp, start = 8.dp))

        }
        Spacer(modifier.size(30.dp))
        Row(Modifier.fillMaxWidth().padding(start = 60.dp)) {
            Image(
                modifier = Modifier.size(40.dp).clip(RoundedCornerShape(6.dp)),
                contentDescription = "F",
                painter = painterResource(id = com.example.miaplicacion.R.drawable.facebook_logo),

            )
            Text(text = "Continue as Dave Johnson", color = Color.Blue, modifier = Modifier.padding(start = 20.dp, top = 10.dp),fontWeight = FontWeight.Bold)
        }
        Column (verticalArrangement = Arrangement.Bottom, modifier = Modifier.padding(top = 100.dp)){
            HorizontalDivider(Modifier.width(1000.dp).padding(start = 20.dp, end = 8.dp, top = 80.dp))
            Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
                Text(text = "Don´t have and Account?", Modifier.padding(start = 110.dp))
                Text(modifier = Modifier.padding(start = 10.dp), text = "Sign Up. ", color = Color.Blue,fontWeight = FontWeight.Bold)
            }
        }

    }


}

@Composable
fun Pie(modifier: Modifier = Modifier){
    Column (){
        HorizontalDivider(Modifier.width(100.dp).padding(start = 8.dp, end = 8.dp))
        Row() {
            Text(text = "Don´t have and Account?", textAlign = TextAlign.Center)
        }
    }
}


@Composable
fun SalirDeLaApp() { //cree la funcion pero  lo
    val activity = LocalContext.current as Activity
    activity.finish()
}

@Composable
fun ValidarLogin(cadena:String,correo:String): Boolean {
    if(cadena.length>6&&Patterns.EMAIL_ADDRESS.matcher(correo).matches()){//en esta unica declaracion comparo ambas condiciones
        return true;
    }
    return false;
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreviewLogin_Instagram() {
    Login(Modifier)
}

