package com.example.miaplicacion.PracticaModelViewViewmodel.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miaplicacion.PracticaModelViewViewmodel.model.Usuario
import com.example.miaplicacion.PracticaModelViewViewmodel.viewmodel.UsuarioViewModel
import com.example.miaplicacion.vista.PantallaDeLimonada

@Composable
fun UsuarioCambiar(viewModel: UsuarioViewModel,modifier: Modifier){
    val usuario by viewModel.cambiardatos.collectAsState()
Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
    Text(text = "${usuario.nombre}")
    Spacer(modifier.size(20.dp))
    Text(text = "${usuario.edad}")
    Spacer(modifier.size(20.dp))
    Text(text = "${usuario.email}")
    Spacer(modifier.size(20.dp))
    Button(onClick = { viewModel.actualizarUsuario("cambio",5,"correocambiado@gmail.com")}  )
    {
        Text("cambiar")
    }
}
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreviewPractica() {
    UsuarioCambiar(viewModel = UsuarioViewModel(),Modifier)//raro el como se pasa e argumento
}