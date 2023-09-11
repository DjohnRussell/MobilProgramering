package no.hiof.danirljr.questify.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import no.hiof.danirljr.questify.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login(logo : Painter, contentDescription: String, login: () -> Unit) {
    var password by remember { mutableStateOf("") }
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = logo, contentDescription =  contentDescription)

        OutlinedTextField(value = "username" , onValueChange = {})
        OutlinedTextField(value = password,
            onValueChange = { password = it},
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )

        Button(onClick = { login() }) {
            Text(text = stringResource(R.string.login))
        }
    }

}