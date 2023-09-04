package no.hiof.danirljr.forlesninglazycolum

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import no.hiof.danirljr.forlesninglazycolum.model.Superhero
import no.hiof.danirljr.forlesninglazycolum.ui.theme.ForlesningLazyColumTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ForlesningLazyColumTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SimpleList()
                }
            }
        }
    }
}

@Composable
fun SimpleList() {
    val superheros = listOf(
        Superhero("Superman", "Clark Kent", Icons.Default.Face),
        Superhero("Superman", "Clark Kent", Icons.Default.Face),
        Superhero("Superman", "Clark Kent", Icons.Default.Face),
        Superhero("Superman", "Clark Kent", Icons.Default.Face),
        Superhero("Superman", "Clark Kent", Icons.Default.Face),
        Superhero("Superman", "Clark Kent", Icons.Default.Face),
        Superhero("Superman", "Clark Kent", Icons.Default.Face),
        Superhero("Superman", "Clark Kent", Icons.Default.Face),
        Superhero("Superman", "Clark Kent", Icons.Default.Face),
        Superhero("Batman", "Bruce Wayne", Icons.Default.AccountBox),
        Superhero("Batman", "Bruce Wayne", Icons.Default.AccountBox),
        Superhero("Batman", "Bruce Wayne", Icons.Default.AccountBox),
        Superhero("Batman", "Bruce Wayne", Icons.Default.AccountBox),
        Superhero("Batman", "Bruce Wayne", Icons.Default.AccountBox),
        Superhero("Batman", "Bruce Wayne", Icons.Default.AccountBox),
        Superhero("Batman", "Bruce Wayne", Icons.Default.AccountBox),
        Superhero("Batman", "Bruce Wayne", Icons.Default.AccountBox),
        Superhero("Wonder Woman", "Diana Prince", Icons.Default.Favorite),
        Superhero("Wonder Woman", "Diana Prince", Icons.Default.Favorite),
        Superhero("Wonder Woman", "Diana Prince", Icons.Default.Favorite),
        Superhero("Wonder Woman", "Diana Prince", Icons.Default.Favorite),
        Superhero("Wonder Woman", "Diana Prince", Icons.Default.Favorite),
        Superhero("Wonder Woman", "Diana Prince", Icons.Default.Favorite),
        Superhero("Wonder Woman", "Diana Prince", Icons.Default.Favorite),
        Superhero("Wonder Woman", "Diana Prince", Icons.Default.Favorite),
        Superhero("Wonder Woman", "Diana Prince", Icons.Default.Favorite),
        Superhero("Wonder Woman", "Diana Prince", Icons.Default.Favorite),
        Superhero("Wonder Woman", "Diana Prince", Icons.Default.Favorite),
        Superhero("Wonder Woman", "Diana Prince", Icons.Default.Favorite),
        Superhero("Wonder Woman", "Diana Prince", Icons.Default.Favorite),
        Superhero("Wonder Woman", "Diana Prince", Icons.Default.Favorite),

    )

    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        item {Text(text = "Superheros", fontSize = 32.sp)}

        items(superheros) { superhero ->
            Row {

                Icon(imageVector = superhero.icon, contentDescription = null)
                Text(text = superhero.name )
                Text(text = superhero.alterEgo)
            }
        }
        }
    }

@Composable
fun SuperheroRow(superhero: Superhero) {

}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ForlesningLazyColumTheme {
        SimpleList()
    }
}