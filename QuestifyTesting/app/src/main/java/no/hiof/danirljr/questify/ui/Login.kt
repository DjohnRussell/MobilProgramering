package no.hiof.danirljr.questify.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import no.hiof.danirljr.questify.R
import no.hiof.danirljr.questify.ui.model.User

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login(logo : Painter, contentDescription: String, login: () -> Unit, createAccount: () -> Unit) {
    var password by remember { mutableStateOf("") }
    var username by remember { mutableStateOf("") }
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = logo, contentDescription =  contentDescription)

        var userInputUsername = OutlinedTextField(value = username ,
            onValueChange = {username = it},
            label = { Text(text = stringResource(id = R.string.username))})
        var userInputPassword = OutlinedTextField(value = password,
            onValueChange = { password = it},
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )

        //Denne skal gi brukernavn og passord til User, Men The User vil holde all info den skal arve
        //Brukernavn og passord fra User men ha sine engen instans variabler som avtar: Painter,
        //xp: Int, hp: Int, gold: Int, goldPicture: Painter
        //var u1 = User(userInputUsername.toString(), userInputPassword.toString())


        Button(onClick = { login()}, modifier = Modifier
            ) {
            Text(text = stringResource(R.string.login))
        }
        Button(onClick = {createAccount()}) {
            Text(text = "Create Account")

        }

        }
}












