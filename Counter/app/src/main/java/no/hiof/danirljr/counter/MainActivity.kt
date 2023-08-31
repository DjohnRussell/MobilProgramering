package no.hiof.danirljr.counter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import no.hiof.danirljr.counter.ui.theme.CounterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CounterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    ButtonIncreseDecrease()

                }
            }
        }
    }
}

@Composable
fun ButtonIncreseDecrease( modifier: Modifier = Modifier) {
    var counter by remember{ mutableStateOf(0) }
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {



        Text(text = "Counter: " + "$counter")

        Spacer(modifier = Modifier
            .height(30.dp))

        Row {
            Box(
                modifier = modifier) {
                Button(onClick = { counter ++ }
                ) {
                    Text("+")
                }
            }
            Box(
                modifier = modifier) {
                Button(onClick = { counter --}
                ) {
                    Text("-")
                }
            }

        }
        Box(
            modifier = modifier) {
            Button(onClick = { counter = 0 }
            ) {
                Text("Reset")
            }
        }

    }


}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CounterTheme {

    }
}