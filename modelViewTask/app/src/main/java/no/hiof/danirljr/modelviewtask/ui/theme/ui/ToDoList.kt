package no.hiof.danirljr.modelviewtask.ui.theme.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import no.hiof.danirljr.modelviewtask.ui.theme.ToDoViewModel
import kotlin.reflect.KProperty

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ToDoList(viewModel: ToDoViewModel) {

    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text(
            text = "To Do List",
            style = MaterialTheme.typography.headlineLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier)

        var Task by remember { mutableStateOf("") }
        OutlinedTextField(value = Task, onValueChange = {Task= it},
        )

        Row {
            Button(onClick = { viewModel.addTask(Task)}) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add element"
                )
            }
            Button(onClick = { viewModel.removeTask(Task) }) {
                Icon(
                    imageVector = Icons.Default.Delete ,
                    contentDescription = "Remove element",)
            }


        }




    }




    }





