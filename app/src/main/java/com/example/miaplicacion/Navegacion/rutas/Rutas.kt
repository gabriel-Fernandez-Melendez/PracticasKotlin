package com.example.miaplicacion.Navegacion.rutas

sealed class Rutas(val ruta : String) {
    object  Pantalla1 : Rutas("Pantalla1")
    object  Pantalla2 : Rutas("Pantalla2")
}