package com.example.lab6si.screen

import android.support.v4.os.IResultReceiver.Default
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.lab6si.R
import com.example.lab6si.navigation.AppNavigation
import com.example.lab6si.navigation.AppScreens

@Composable
fun SecondScreen(navController:NavController){
SecondBodyContent(navController,"Bad bunny","El conejo malo viene a guatemala! no te pierdas al rey del trap y el regueton, con un buen ambiente y amigos","24/07/2023")
}

@Composable
fun SecondBodyContent(navController: NavController,concertTitle: String,concertDescription: String,concertDate: String) {

        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.bbb),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.5f)
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(Color.White)
                    .padding(16.dp)
            ) {
                Text(
                    text = concertTitle,
                    color = Color.Black,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                Text(
                    text = "Fecha: $concertDate",
                    fontSize = 16.sp,
                    color = Color.Gray,
                    modifier = Modifier.padding(bottom = 16.dp)
                )


                Text(
                    text = concertDescription,
                    color = Color.Black,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .fillMaxWidth()



                )
                Button(onClick = {
                    navController.popBackStack()
                }){
                    Text(text = "regresar")
                }


            }

        }


}

