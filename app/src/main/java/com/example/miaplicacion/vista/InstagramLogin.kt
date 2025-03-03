package com.example.miaplicacion.vista

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Login_Instagram(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize().fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    )
    {
    Image(contentDescription = "intagram", painter = painterResource(id = com.example.miaplicacion.R.drawable.instagram)
    )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreviewLogin_Instagram() {
    Login_Instagram(Modifier)
}