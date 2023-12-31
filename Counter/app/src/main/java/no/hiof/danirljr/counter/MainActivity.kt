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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

        CountCheckNImageChange(checkNum = counter)

        Spacer(modifier = Modifier
            .height(30.dp))

        TextAndCountChecker(counter)

        Spacer(modifier = Modifier
            .height(30.dp))

        Row {
            Box(
                modifier = modifier) {
                Button(onClick = { counter +=1 }
                    ) {
                    //Text("+")
                    Icon(imageVector = Icons.Default.KeyboardArrowUp, contentDescription = "Increase" )
                }
            }
            Box(
                modifier = modifier) {
                Button(onClick = { counter -=1}
                ) {
                    //Text("-")
                    Icon(imageVector = Icons.Default.KeyboardArrowDown, contentDescription = "Decrease" )
                }
            }

        }
        Box(
            modifier = modifier) {
            Button(onClick = { counter = 0 }
            ) {
                //Text("Reset")
                Icon(imageVector = Icons.Default.Refresh ,
                    contentDescription = "Refresh")
            }
        }

    }


}


@Composable
fun CountCheckNImageChange(checkNum : Int) {
    val img = if (checkNum < 0)
        Image(
            painter = painterResource(R.drawable.minus),
            contentDescription = "Angry birds")
            else if (checkNum > 0)
        Image(
            painter = painterResource(R.drawable.pluss),
            contentDescription = "Happy birds")
            else
        Image(
            painter = painterResource(R.drawable.zero),
            contentDescription = "neutral birds")
        
}

@Composable
fun TextAndCountChecker(number: Int) {
    val textColor = if (number < 0)
        Color.Red
    else
        Color.Black

    Text(
        text = "Counter: $number",
        color = textColor,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CounterTheme {

    }
}