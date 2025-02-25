package com.example.miaplicacion.Navegacion.HostNav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.miaplicacion.Navegacion.pantallas.Pantalla1
import com.example.miaplicacion.Navegacion.pantallas.Pantalla2

import com.example.miaplicacion.Navegacion.rutas.Rutas

@Composable
fun Navegacion(){
    val controlador_nav = rememberNavController()
NavHost(
    navController = controlador_nav,
    startDestination = "Pantalla1"
){
    composable(Rutas.Pantalla1.ruta){ Pantalla1(controlador_nav) }
    composable(Rutas.Pantalla2.ruta){ Pantalla2(controlador_nav) }
}
}