package com.example.miaplicacion.vista

import android.app.Activity
import android.service.autofill.OnClickAction
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
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


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
            enabled = ValidarLogin(contraseña), //esto tengo que cambiarlo
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
        Row(Modifier.fillMaxWidth().padding(start = 40.dp)) {
            Image(
                modifier = Modifier.size(40.dp),
                contentDescription = "F",
                painter = painterResource(id = com.example.miaplicacion.R.drawable.facebook_logo),
            )
        }
    }
}

@Composable
fun SalirDeLaApp() {
    val activity = LocalContext.current as Activity
    activity.finish()
}

fun ValidarLogin(cadena:String): Boolean {
    if(cadena.length>6){
        return true;
    }
    return false;
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreviewLogin_Instagram() {
    Login_Instagram(Modifier)
}

