package com.example.miaplicacion.ModeloMVVM.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ContadorViewModel : ViewModel() {
    //estas clase se declaran como clase y  no como ficheros, se tiene que llevar el control de las variables
    //por separado , una la que se muestra por pantalla y la otra es la que se va a mostrar

    //campos de la clase como atributos propios de la misma
    private val _contador = MutableStateFlow(0 )//el que tenga un "_" indica que es privada, esta es la que cambia de valor
    val contador =_contador.asStateFlow() //esta no es privada y es la que refleja el valor de la primera y la que se mostrara por pantalla

    //funcion para contar cada vez que se precione el boton
    fun contar(){
        _contador.value++
    }

}