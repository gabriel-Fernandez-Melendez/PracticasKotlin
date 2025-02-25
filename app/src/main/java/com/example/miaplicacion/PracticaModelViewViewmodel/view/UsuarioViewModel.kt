package com.example.miaplicacion.PracticaModelViewViewmodel.view

import androidx.lifecycle.ViewModel
import com.example.miaplicacion.PracticaModelViewViewmodel.model.Usuario
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class UsuarioViewModel: ViewModel() {
    val usuario =Usuario("",5,"")
    private  val _UsuarioController = MutableStateFlow(usuario)
    val cambiardatos =_UsuarioController.asStateFlow()

    //hay que implementar el metodo
}