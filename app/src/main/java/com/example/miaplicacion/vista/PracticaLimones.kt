package com.example.miaplicacion.vista

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miaplicacion.CuadrosLayout
import com.example.miaplicacion.ui.theme.MiAplicacionTheme

@Composable
fun Limonada(modifier: Modifier=Modifier){
Column (modifier.fillMaxSize()) {
    Text(modifier = Modifier.background(Color(173, 244, 230)).fillMaxWidth().height(100.dp),
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        text = "Lemonade",


    )

}
    Button(onClick = {},Modifier) { }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview2() {
    Limonada(Modifier)
    }


