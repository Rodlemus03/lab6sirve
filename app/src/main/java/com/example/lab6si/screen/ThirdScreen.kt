package com.example.lab6si.screen

import android.support.v4.os.IResultReceiver.Default
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.ColumnScopeInstance.weight
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.lab6si.navigation.AppNavigation
import com.example.lab6si.navigation.AppScreens

@Composable
fun ThirdScreen(navController:NavController){
    ThirdBodyContent(navController)
}
data class Evento(val nombre: String, val descripcion: String)


val listaEventos = listOf(
    Evento("Bad bunny", "Reguetón"),
    Evento("Los tigres del norte", "Banda"),
    Evento("Shakira", "Pop"),
    Evento("Romeo Santos", "Bachata"),
    Evento("Adele", "Pop"),
    Evento("Taylor Swift", "Pop"),
    Evento("Ed Sheeran", "Pop"),
    Evento("Beyoncé", "R&B"),
    Evento("Drake", "Hip-Hop"),
    Evento("Billie Eilish", "Pop"),
    Evento("Coldplay", "Pop/Rock"),
    Evento("Bruno Mars", "Pop"),
    Evento("Ariana Grande", "Pop"),
    Evento("Justin Bieber", "Pop"),
    Evento("Katy Perry", "Pop"),
    Evento("Rihanna", "Pop/R&B"),
    Evento("The Weeknd", "R&B")
)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThirdBodyContent(navController: NavController){
    LazyColumn{
        items(listaEventos){ item ->
            ListItem(item)
        }

        item {

            Button(
                onClick = {
                    // Acción para regresar, por ejemplo, navegación a la pantalla anterior.
                    navController.popBackStack()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text("Regresar")
            }
        }
    }
}


@Composable
fun ListItem(Evento: Evento, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(8.dp)
            .background(Color.LightGray)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = Evento.nombre,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            // Agregar el icono de tres puntos
            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = null, // Puedes proporcionar una descripción
                tint = Color.Black
            )
        }

        Spacer(modifier = modifier.height(8.dp))

        LazyRow {
            items(1) {
                    item ->
                Text(text = Evento.descripcion, color = Color.Black)
            }
        }
    }
}

