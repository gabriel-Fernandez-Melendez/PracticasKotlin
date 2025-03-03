package com.example.miaplicacion.PracticaModelViewViewmodel.viewmodel

import androidx.lifecycle.ViewModel
import com.example.miaplicacion.PracticaModelViewViewmodel.model.Usuario
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class UsuarioViewModel: ViewModel() {
    //esta por tener datos cargados directamente
    private  val _UsuarioController = MutableStateFlow(Usuario("cosas",5,"correo@gmail.com"))
    val cambiardatos =_UsuarioController.asStateFlow()

    fun actualizarUsuario(nuevoNombre: String, nuevaEdad: Int, nuevoEmail: String) {
        _UsuarioController.value=Usuario(nuevoNombre,nuevaEdad,nuevoEmail)
    }

}