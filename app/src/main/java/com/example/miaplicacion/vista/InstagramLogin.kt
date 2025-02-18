package com.example.miaplicacion.vista

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun Login_Instagram(modifier: Modifier = Modifier) {
    var texto_login by remember {  mutableStateOf("") }
    var d by remember {  mutableStateOf("") }
    var vardiable by remember {  mutableStateOf("") }
    Column(modifier = Modifier
        .background(Color(119, 6, 84, 255))
        .fillMaxWidth()
        .size(46.dp)) { Text(text = "")  }
    Column(horizontalAlignment = Alignment.Start, modifier = modifier.padding(start = 360.dp, top = 50.dp)) {Icon(Icons.Default.Clear, contentDescription = " ")  }
    Column(modifier = Modifier
        .fillMaxSize()
        .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    )
    {


    Image(modifier = Modifier.size(200.dp), contentDescription = "intagram", painter = painterResource(id = com.example.miaplicacion.R.drawable.instagram))
        TextField(value =texto_login, onValueChange = {texto_login = it}, label = { Text("Email")}, shape = RoundedCornerShape(8.dp), modifier = Modifier.fillMaxWidth().padding(start = 8.dp, end = 8.dp))
        Spacer(modifier.size(20.dp))
        TextField(value =texto_login, onValueChange = {texto_login = it}, label = { Text("Password")}, shape = RoundedCornerShape(8.dp), modifier = Modifier.fillMaxWidth().padding(start = 8.dp, end = 8.dp))
        Column(horizontalAlignment = Alignment.Start, modifier = modifier.padding(start = 270.dp, top = 10.dp, end = 8.dp)) { Text(text = "Forgot password?", color = Color.Blue, fontWeight = FontWeight.Bold)  }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreviewLogin_Instagram() {
    Login_Instagram(Modifier)
}