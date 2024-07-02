package com.edu.pe.ec2_vegaortizdavid

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Formulario() {
    var arrozConPollo by remember { mutableStateOf(false) }
    var lomoSaltado by remember { mutableStateOf(false) }
    var ajiDeGallina by remember { mutableStateOf(false) }
    var tallarines by remember { mutableStateOf(false) }
    var arrozChaufa by remember { mutableStateOf(false) }
    var otro by remember { mutableStateOf(false) }

    var visitedCountries by remember { mutableStateOf("") }
    var speaksEnglish by remember { mutableStateOf("") }
    var likesTechnology by remember { mutableStateOf("") }
    var worksRemotely by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "CUESTIONARIO",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(text = "1. Marque sus platos favoritos.", fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))
        CheckboxRow("Arroz con pollo", arrozConPollo) { arrozConPollo = it }
        CheckboxRow("Lomo Saltado", lomoSaltado) { lomoSaltado = it }
        CheckboxRow("Ají de gallina", ajiDeGallina) { ajiDeGallina = it }
        CheckboxRow("Tallarines", tallarines) { tallarines = it }
        CheckboxRow("Arroz Chaufa", arrozChaufa) { arrozChaufa = it }
        CheckboxRow("Otro", otro) { otro = it }

        Spacer(modifier = Modifier.height(16.dp))

        QuestionRadioGroup("2. ¿Visitaste algún país de Europa, Asia o África?", visitedCountries) {
            visitedCountries = it
        }
        QuestionRadioGroup("3. ¿Hablas Inglés?", speaksEnglish) {
            speaksEnglish = it
        }
        QuestionRadioGroup("4. ¿Te gusta la tecnología?", likesTechnology) {
            likesTechnology = it
        }
        QuestionRadioGroup("4. ¿Realizas trabajo remoto?", worksRemotely) {
            worksRemotely = it
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { /* Acción al resolver */ }) {
            Text("Resolver")
        }
    }
}

@Composable
fun CheckboxRow(label: String, checked: Boolean, onCheckedChange: (Boolean) -> Unit) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Checkbox(checked = checked, onCheckedChange = onCheckedChange)
        Text(text = label)
    }
}

@Composable
fun QuestionRadioGroup(question: String, selectedOption: String, onOptionSelected: (String) -> Unit) {
    Column {
        Text(text = question, fontWeight = FontWeight.Bold)
        Row {
            RadioButton(selected = selectedOption == "SI", onClick = { onOptionSelected("SI") })
            Text(text = "SI")
            Spacer(modifier = Modifier.width(16.dp))
            RadioButton(selected = selectedOption == "NO", onClick = { onOptionSelected("NO") })
            Text(text = "NO")
        }
    }
}

