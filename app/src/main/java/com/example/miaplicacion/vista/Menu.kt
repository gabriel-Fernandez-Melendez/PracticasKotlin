package com.example.miaplicacion.vista

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Mimenu(modifier: Modifier =Modifier){
    var expanded by remember { mutableStateOf(false ) }
    Box(modifier = modifier.padding(5.dp)){
        IconButton(onClick = {expanded =!expanded}) {
            Icon(Icons.Default.Menu, contentDescription = " ")
        }
    }
    DropdownMenu(
        expanded = expanded,
        onDismissRequest = {expanded = false},
    ) {
        DropdownMenuItem(
            text = { Text("opcion1")},
            onClick = {} //aqui va funcionalidad
        )
        DropdownMenuItem(
            text = { Text("opcion2")},
            onClick = {} //aqui va funcionalidad
        )
    }

}

@Composable
fun MimenuLista(modifier: Modifier =Modifier){
    var expanded by remember { mutableStateOf(false ) }
    val lista = listOf("Matematicas","Fisica","Quimica","Dibujo")
    Box(modifier = modifier.padding(5.dp)){
        IconButton(onClick = {expanded =!expanded}) {
            Icon(Icons.Default.Menu, contentDescription = " ")
        }
    }
    DropdownMenu(
        expanded = expanded,
        onDismissRequest = {expanded = false},
    ) {
        lista.forEach {
            DropdownMenuItem(
                text = { Text(it)},
                onClick = {} //aqui va funcionalidad (aqui  tendrias que meter un  dato de lsa data class que  guarde lo  que quieres ejecutar)
            )
        }
    }

}

@Composable
fun MimenuListaIconos(modifier: Modifier =Modifier){
    var expanded by remember { mutableStateOf(false ) }
    val lista = listOf("Matematicas","Fisica","Quimica","Dibujo")
    Box(modifier = modifier.padding(5.dp)){
        IconButton(onClick = {expanded =!expanded}) {
            Icon(Icons.Default.Menu, contentDescription = " ")
        }
    }
    DropdownMenu(
        expanded = expanded,
        onDismissRequest = {expanded = false},
    ) {
        lista.forEach {

            DropdownMenuItem(
                text = { Text(it)},
                onClick = {},
                leadingIcon ={ Icon( Icons.Default.AccountBox, contentDescription = "") }//aqui va funcionalidad (aqui  tendrias que meter un  dato de lsa data class que  guarde lo  que quieres ejecutar)
            )
        }
    }

}

@Composable
fun MimenuListadividida(modifier: Modifier =Modifier){
    var expanded by remember { mutableStateOf(false ) }
    val lista = listOf("Matematicas","Fisica","Quimica","Dibujo")
    Box(modifier = modifier.padding(5.dp)){
        IconButton(onClick = {expanded =!expanded}) {
            Icon(Icons.Default.Menu, contentDescription = " ")
        }
    }
    DropdownMenu(
        expanded = expanded,
        onDismissRequest = {expanded = false},
    ) {
        lista.forEach {
            DropdownMenuItem(
                text = { Text(it)},
                onClick = {} //aqui va funcionalidad (aqui  tendrias que meter un  dato de lsa data class que  guarde lo  que quieres ejecutar)
            )
            HorizontalDivider() //esto  pone una linea que divivde las opcciones del menu
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreviewMenu() {
    MimenuListaIconos(Modifier)
}