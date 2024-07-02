package com.edu.pe.ec2_vegaortizdavid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text

class FormularioActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Formulario()
        }
    }
}

@Composable
fun Formulario() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("AppIDAT") })
        },
        content = {
            QuestionnaireForm()
        }
    )
}

@Composable
fun QuestionnaireForm() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("CUESTIONARIO", fontSize = 24.sp, modifier = Modifier.padding(bottom = 16.dp))

        // Question 1
        Text("1. Marque sus platos favoritos.", fontSize = 18.sp)
        Column(modifier = Modifier.padding(8.dp)) {
            listOf("Arroz con pollo", "Lomo Saltado", "Ají de gallina", "Tallarines", "Arroz Chaufa", "Otro").forEach { item ->
                var checked by remember { mutableStateOf(false) }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = checked,
                        onCheckedChange = { checked = it }
                    )
                    Text(text = item)
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Question 2
        Text("2. ¿Visitaste algún país de Europa, Asia o África?", fontSize = 18.sp)
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)) {
            var selectedOption by remember { mutableStateOf(true) }
            RadioButton(
                selected = selectedOption,
                onClick = { selectedOption = true }
            )
            Text(text = "SI")
            Spacer(modifier = Modifier.width(8.dp))
            RadioButton(
                selected = !selectedOption,
                onClick = { selectedOption = false }
            )
            Text(text = "NO")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Question 3
        Text("3. ¿Hablas Inglés?", fontSize = 18.sp)
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)) {
            var selectedOption by remember { mutableStateOf(true) }
            RadioButton(
                selected = selectedOption,
                onClick = { selectedOption = true }
            )
            Text(text = "SI")
            Spacer(modifier = Modifier.width(8.dp))
            RadioButton(
                selected = !selectedOption,
                onClick = { selectedOption = false }
            )
            Text(text = "NO")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Question 4
        Text("4. ¿Te gusta la tecnología?", fontSize = 18.sp)
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)) {
            var selectedOption by remember { mutableStateOf(true) }
            RadioButton(
                selected = selectedOption,
                onClick = { selectedOption = true }
            )
            Text(text = "SI")
            Spacer(modifier = Modifier.width(8.dp))
            RadioButton(
                selected = !selectedOption,
                onClick = { selectedOption = false }
            )
            Text(text = "NO")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Question 5
        Text("5. ¿Realizas trabajo remoto?", fontSize = 18.sp)
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)) {
            var selectedOption by remember { mutableStateOf(true) }
            RadioButton(
                selected = selectedOption,
                onClick = { selectedOption = true }
            )
            Text(text = "SI")
            Spacer(modifier = Modifier.width(8.dp))
            RadioButton(
                selected = !selectedOption,
                onClick = { selectedOption = false }
            )
            Text(text = "NO")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { /* Handle form submission */ }) {
            Text("Resolver")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Formulario()
}
