package com.example.lab6si.screen

import android.support.v4.os.IResultReceiver.Default
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lab6si.R
import com.example.lab6si.navigation.AppScreens

@Composable
fun FirstScreen(navController:NavController){
    bodyContent(navController)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun bodyContent(navController:NavController){
    Column {
        TopAppBar(
            title = { Text(text = "TodoEventos") },
            actions = {
                IconButton(onClick = { /* TODO */ }) {
                    Icon(imageVector = Icons.Default.MoreVert, contentDescription = "Options")
                }
            }
        )
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(2) { rowIndex ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    repeat(2) { columnIndex ->
                        val index = rowIndex * 2 + columnIndex
                        if (index < 4) {
                            BotonCuadrado(nombre = "Concierto ${index + 1}", index, navController)
                        }
                    }
                }
            }
            // Botones para cambiar
            item {
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(
                        onClick = {
                            navController.navigate(route = AppScreens.ThirdScreen.ruta)
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(text = "Ir a la lista")
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Button(
                        onClick = {
                            // Agrega la navegación a la pantalla de perfil aquí
                           // navController.navigate(route = AppScreens.PerfilScreen.ruta)
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(text = "Ir a perfil")
                    }
                }
            }
        }
    }
}

@Composable
fun BotonCuadrado(nombre: String,seleccion:Int,navController: NavController) {
    Card(
        modifier = Modifier
            .size(185.dp)
            .clip(MaterialTheme.shapes.medium),
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(text = nombre, fontWeight = FontWeight.Bold)
            Button(onClick = {
                navController.navigate(route = AppScreens.SecondScreen.ruta)
            }){
                Text(text = "Ir")
            }
            Spacer(modifier = Modifier.height(8.dp))
            if(seleccion==0){
                Image(

                    painter = painterResource(id = R.drawable.btr),
                    contentDescription = "Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }else if(seleccion==1){
                Image(

                    painter = painterResource(id = R.drawable.bbb),
                    contentDescription = "Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }else if(seleccion==2){
                Image(

                    painter = painterResource(id = R.drawable.bm),
                    contentDescription = "Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
            else if(seleccion==3){
                Image(

                    painter = painterResource(id = R.drawable.ltdn),
                    contentDescription = "Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }





        }
    }
}
