package com.example.miaplicacion.vista

import android.content.ClipData.Item
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.miaplicacion.Data.Comunidad
import com.example.miaplicacion.R
import com.example.miaplicacion.componente.TarjetaEstandar

@Composable
fun MostrarComunides(modifier: Modifier =  Modifier){
    //lista no mutable(no cambia)
     val milista = listOf(
         Comunidad("Andalucía", "Sevilla", R.drawable.andalucia),
         Comunidad("Aragon", "Zaragoza", R.drawable.arag_n),
         Comunidad("Cataluña", "Barcelona", R.drawable.barcelona),
         Comunidad("Canarias", "Santa Cruz/Las Palmas", R.drawable.canarias),
         Comunidad("Cantabria", "Santander", R.drawable.cantabria),
         Comunidad("Castilla-La Mancha", "Toledo", R.drawable.castilla_la_mancha),
         Comunidad("Castilla y León", "Valladolid", R.drawable.castilla_le_n),
         Comunidad("Comunidad valenciana", "Valencia", R.drawable.comunidad_valenciana),
         Comunidad("Extremadura", "Mérida", R.drawable.extremadura),
         Comunidad("Galicia", "Santiago de Compostela", R.drawable.galicia),
         Comunidad("Islas Baleares", "Palma de Mallorca", R.drawable.islas_baleares),
         Comunidad("La rioja", "Logroño", R.drawable.la_rioja),
         Comunidad("Comunidad de Madrid", "Madrid", R.drawable.madrid),
         Comunidad("Región de Murcia", "Murcia", R.drawable.murcia),
         Comunidad("Navarra", "Pamplona", R.drawable.navarra),
         Comunidad("País Vasco", "Vitoria", R.drawable.pais_vasco),
         Comunidad("Principado de Asturias", "Oviedo", R.drawable.principado_de_asturias)

     )
    LazyColumn (Modifier.fillMaxSize()){
        item{
            Text(
                text = "lista de comunidad"

            )
        }
        items(milista){
            item: Comunidad ->  TarjetaEstandar(modifier,item)
        }
    }


}


