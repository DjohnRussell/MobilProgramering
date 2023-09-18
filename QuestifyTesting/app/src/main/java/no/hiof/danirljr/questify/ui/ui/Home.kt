package no.hiof.danirljr.questify.ui.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import no.hiof.danirljr.questify.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Column( verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        var task by remember { mutableStateOf("") }



             Text(text = "Username",
                 style = MaterialTheme.typography.headlineLarge,
                 textAlign =  TextAlign.Center)

        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally)
        {

            
            Row(
                modifier = Modifier
                    .padding(85.dp)
            ) {

                Card(


                ) {
                    Text(
                        text = "Daily"
                    )
                    Icon(imageVector = Icons.Default.Add
                        , contentDescription = "Add task" )
                }
                Spacer(modifier = Modifier
                    .padding(10.dp))

                Card {
                    Text(
                        text = "Weekly"
                    )
                    Icon(imageVector = Icons.Default.Add
                        , contentDescription = "Add task" )
                }
                Spacer(modifier = Modifier
                    .padding(10.dp))

                Card {
                    Text(
                        text = "Monthly"
                    )
                    Icon(imageVector = Icons.Default.Add
                        , contentDescription = "Add task" )
                }
            }

        }

    }

}


