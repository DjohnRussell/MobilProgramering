package no.hiof.danirljr.questify

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign

@Composable
fun CreateNewUser() {
    Column {

        Text(text = "New Profile",
            style = MaterialTheme.typography.headlineLarge,
            textAlign =  TextAlign.Center)
    }
}