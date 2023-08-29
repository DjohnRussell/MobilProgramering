package no.hiof.danirljr.howisgoingto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import no.hiof.danirljr.howisgoingto.ui.theme.HowIsGoingToTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HowIsGoingToTheme {

                GoingToDo()
            }

        }
    }

    @Preview
    @Composable
    fun GoingToDo() {
        ButtonAndImage(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.Center)
        )

    }

    @Composable
    fun ButtonAndImage(modifier: Modifier = Modifier) {

        // Text for the rendom task mannager



        var resultOfText by remember { mutableStateOf(1) }
        val textResource = when (resultOfText) {
            1 -> stringResource(id = R.string.dinner)
            2 -> stringResource(id = R.string.dishes)

            else -> stringResource(id = R.string.laundy)
        }

        var result by remember { mutableStateOf(1) }
        val imageResource = when (result) {
            1 -> R.drawable.daniel

            else -> R.drawable.sonia
            
            
        }
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = textResource.toString())
            Spacer(modifier = Modifier.height(20.dp))
            Image(
                painter = painterResource(imageResource),
                contentDescription = result.toString()
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { resultOfText = (1 .. 3).random()}) {
                Text(text = stringResource(id = R.string.roll))
                result = (1..2).random() 
            }
        }
    }
}