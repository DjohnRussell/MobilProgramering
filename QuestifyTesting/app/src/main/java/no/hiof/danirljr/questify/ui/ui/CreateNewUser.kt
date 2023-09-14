package no.hiof.danirljr.questify.ui.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Email
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import no.hiof.danirljr.questify.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateNewUser() {
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally ,
        ) {

        Text(text = "New Account",
            style = MaterialTheme.typography.headlineLarge,
            textAlign =  TextAlign.Center)

        Spacer(modifier = Modifier
            .height(20.dp))

        Row(modifier = Modifier
            .padding(35.dp)) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "add username" )
            var userEnterUsername by remember { mutableStateOf("") }
            OutlinedTextField(value = userEnterUsername, onValueChange = {userEnterUsername = it}, 
                label = { Text(text = stringResource(R.string.username))})
        }
        Row(modifier = Modifier
            .padding(35.dp)) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "add password")
            var userEnterPassword by remember { mutableStateOf("") }
            OutlinedTextField(value = userEnterPassword, onValueChange = {userEnterPassword = it},
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                label = { Text(text = stringResource(R.string.password))})
        }
            
        Row(modifier = Modifier
            .padding(35.dp)) {
            Icon(imageVector = Icons.Default.Email, contentDescription = "Enter e-mail" )
            var Email by remember { mutableStateOf("") }
            OutlinedTextField(value = Email , onValueChange =  {Email = it},
                label = { Text(text = stringResource(R.string.email))})
            
        }

        Row(modifier = Modifier
            .padding(35.dp)) {
            Icon(imageVector = Icons.Default.Email, contentDescription = "Enter e-mail" )
            var ConfirmEmail by remember { mutableStateOf("") }
            OutlinedTextField(value = ConfirmEmail , onValueChange =  {ConfirmEmail = it},
                label = { Text(text = stringResource(R.string.confirm_email))})

        }
        
    }
}