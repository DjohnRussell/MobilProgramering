package no.hiof.danirljr.questify.ui.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Card
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import no.hiof.danirljr.questify.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Column( verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        var task by remember { mutableStateOf("") }
         Row {


             Text(text = "Home",
                 style = MaterialTheme.typography.headlineLarge,
                 textAlign =  TextAlign.Center)

             }
            Spacer(modifier = Modifier
                .height(20.dp))




        Row {
            //Icon(imageVector = Icons.Default.Add, contentDescription ="Add task" )
            OutlinedTextField(value = task, onValueChange =  { task = it},
                label = { Text(text = stringResource(R.string.your_task))},
            )
             Spacer(modifier = Modifier
                 .padding(10.dp))
            Button(onClick = { },

            ) {
                Icon(imageVector = Icons.Default.Add,
                    contentDescription = "Add" )


            }
           


         }

    }

}


