package com.edu.pe.ec2_vegaortizdavid

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class TestPsicologico(val titulo: String, val descripcion: String, val fechaPublicacion: String)

@Composable
fun listas() {
    var mostrarLista by remember { mutableStateOf(false) }
    val listaDeTests = listOf(
        TestPsicologico("Test de Personalidad", "Evalúa diferentes aspectos de la personalidad.", "01-01-2021"),
        TestPsicologico("Test de Ansiedad", "Mide el nivel de ansiedad de una persona.", "05-02-2021"),
        TestPsicologico("Test de Depresión", "Ayuda a identificar signos de depresión.", "12-03-2021"),
        TestPsicologico("Test de Inteligencia Emocional", "Determina la capacidad de manejar las emociones.", "18-04-2021"),
        TestPsicologico("Test de Autoestima", "Evalúa el nivel de autoestima.", "25-05-2021"),
        TestPsicologico("Test de Estrés", "Mide el nivel de estrés de una persona.", "02-06-2021"),
        TestPsicologico("Test de Habilidades Sociales", "Evalúa las habilidades sociales y de comunicación.", "10-07-2021"),
        TestPsicologico("Test de Adicciones", "Identifica posibles adicciones y su severidad.", "15-08-2021"),
        TestPsicologico("Test de Resiliencia", "Mide la capacidad de una persona para recuperarse de situaciones difíciles.", "22-09-2021"),
        TestPsicologico("Test de Memoria", "Evalúa la capacidad de recordar información.", "30-10-2021")
    )

    Column(modifier = Modifier.padding(16.dp)) {
        Button(onClick = { mostrarLista = true }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "GENERAR LISTA")
        }

        Spacer(modifier = Modifier.height(16.dp))

        if (mostrarLista) {
            LazyColumn {
                items(listaDeTests) { test ->
                    TestCard(test)
                }
            }
        }
    }
}

@Composable
fun TestCard(test: TestPsicologico) {
    Card(modifier = Modifier
        .padding(8.dp)
        .fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = test.titulo, fontSize = 20.sp, fontWeight = FontWeight.Bold, style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = test.descripcion, fontSize = 16.sp, style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Fecha de Publicación: ${test.fechaPublicacion}", fontSize = 14.sp, style = MaterialTheme.typography.bodySmall)
        }
    }
}
