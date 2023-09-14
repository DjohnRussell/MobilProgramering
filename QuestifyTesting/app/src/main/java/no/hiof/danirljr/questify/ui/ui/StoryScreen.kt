package no.hiof.danirljr.questify.ui.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun StoryScreen(createNewUser: () -> Unit, login : () -> Unit) {
    
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(
            text = "WimWim´s Backgroud Story",
            style = MaterialTheme.typography.headlineLarge,
            textAlign =  TextAlign.Center
        )

        Spacer(modifier = androidx.compose.ui.Modifier
            .height(50.dp))


        Text(text =
        "In the magical land of Elmvale, a small elf" +
                "named WimWim faced a colossal threat" +
                "– a monstrous octopus terrorizing their" +
                " peaceful land. WimWim couldn't defeat it alone." +
                " You, a hero from one of the three races " +
                "- Witches and Wizards, Warriors, or Forest People," +
                " were chosen to join WimWim's quest." +
                " Each race had unique abilities that" +
                " would prove crucial." +
                " You embarked on this perilous adventure," +
                " gaining magical amulets, star-forged swords," +
                " and the wisdom of the forest. Together," +
                " you confronted the beast in an epic battle." +
                " With a final," +
                " decisive strike, the octopus was defeated." +
                " Elmvale rejoiced, and you returned as heroes." +
                " But the quest isn't over." +
                " You can help WimWim defeat the octopus" +
                " for good by completing daily tasks," +
                " earning items, and strengthening your alliance." +
                " Do you wish to help?",
            style = MaterialTheme.typography.bodyMedium,
            textAlign =  TextAlign.Center
            )

        Spacer(modifier = androidx.compose.ui.Modifier
            .height(40.dp))

        Row {
            Button(onClick = { createNewUser() },
                colors = ButtonDefaults.buttonColors(Color.Transparent)) {
                Text(text = "Yes",
                    color = Color.Black)

            }
            Button(onClick = { login() },
                colors = ButtonDefaults.buttonColors(Color.Transparent)) {
                Text(text = "No",
                    color = Color.Black)
            }
        }
    }

}