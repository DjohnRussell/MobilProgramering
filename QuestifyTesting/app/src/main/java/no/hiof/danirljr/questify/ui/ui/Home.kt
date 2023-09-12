package no.hiof.danirljr.questify.ui.ui

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import no.hiof.danirljr.questify.ui.model.User

@Composable
fun HomeScreen() {
    Column( verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
         Row {


             Text(text = "Home",
                 style = MaterialTheme.typography.headlineLarge,
                 textAlign =  TextAlign.Center)

             }
        Card (modifier = Modifier
            .background(Color.Gray)){
            Button(onClick = { },
                Modifier.fillMaxWidth()
            ) {
                Text(text = "Add a Task +" )
        }
            Spacer(modifier = Modifier
                .height(20.dp))

            Button(onClick = { },
                Modifier.fillMaxWidth()) {
                Text(text = "10 Minuttes Cleaning ")
                androidx.compose.material3.Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = "Check" )
            }
            Button(onClick = { },
                Modifier.fillMaxWidth()) {
                Text(text = " Wash Clothes ")
                androidx.compose.material3.Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = "Check" )
            }





         }

    }

}