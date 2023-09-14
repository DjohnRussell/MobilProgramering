package no.hiof.danirljr.questify.ui.ui

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import no.hiof.danirljr.questify.R

//Sword-slash sound for login button ?
@Composable
fun PlaySound(context: Context) {
    val mp : MediaPlayer = MediaPlayer.create(context, R.raw.sword_slash)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login(logo : Painter, contentDescription: String, login: () -> Unit, storyScreen: () -> Unit) {
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
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password))


        Button(
            onClick = { login()},
            colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(id = R.color.kotlin_pink) ),
            modifier = Modifier

            ) {
            Text(
                text = stringResource(R.string.login),

            )
        }
        Button(
            onClick = {storyScreen()},
            colors = ButtonDefaults.buttonColors(Color.Transparent)) {
            Text(
                text = stringResource(R.string.create_account),
                color = Color.Black
            )

        }

        }



}












