package com.edu.pe.ec2_vegaortizdavid

//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import com.edu.pe.ec2_vegaortizdavid.ui.theme.EC2VegaOrtizDavidTheme
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            EC2VegaOrtizDavidTheme {
//                Main()
//            }
//        }
//    }
//}
//
////@Preview(showBackground = true)
////@Composable
////fun GreetingPreview() {
////    EC2VegaOrtizDavidTheme {
////
////    }
////}


import MenuScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "menu") {
                composable("menu") { MenuScreen(navController) }

                composable("formulario") {
                    Formulario()
                }
                composable("listas") {
                    listas()
                }



                // Agrega aquí las demás pantallas según sea necesario
            }


        }
    }
}

@Composable
fun MySpace(espacio: Int){
    Spacer(modifier = Modifier.size(espacio.dp))
}