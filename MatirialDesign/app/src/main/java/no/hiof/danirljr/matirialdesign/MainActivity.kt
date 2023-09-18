package no.hiof.danirljr.matirialdesign

import android.graphics.Paint.Style
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.AppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MatirialScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MatirialScreen( modifier: Modifier = Modifier) {

    val SliderState = remember { mutableStateOf(0.5f) }

    Column {
        TextField(value = "Input", onValueChange = {})
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Click me!!")
        }


        Switch(checked = true, onCheckedChange = {} )
        Switch(checked = false, onCheckedChange = {} )
        Slider(value = SliderState.value, onValueChange ={SliderState.value = it} )
        RadioButton(selected = true, onClick = { /*TODO*/ })
        RadioButton(selected = false, onClick = { /*TODO*/ })
        CircularProgressIndicator(progress = SliderState.value)


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppTheme{
        MatirialScreen()
    }
}