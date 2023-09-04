package no.hiof.danirljr.moviecollection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import no.hiof.danirljr.moviecollection.models.Movie
import no.hiof.danirljr.moviecollection.ui.theme.MovieCollectionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieCollectionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    MovieList()

                }
            }
        }
    }
}


@Composable
fun MovieList() {
    val moviesList = listOf(

        Movie(painterResource(id = R.drawable.batman), "Batman",
           1989, 1.44, Icons.Default.Favorite ),
        Movie(painterResource(id = R.drawable.batman_returns), "Batman Returns",
            1992, 2.06,Icons.Default.Favorite),
        Movie(painterResource(id = R.drawable.batman_forever), "Batman Forever",
            1995, 2.02,Icons.Default.Favorite),
        Movie(painterResource(id = R.drawable.batmanandrobin), "Batman & Robin",
            1997, 2.05,Icons.Default.Favorite),
        Movie(painterResource(id = R.drawable.spider), "Spider-Man",
            2002, 2.01,Icons.Default.Favorite),
        Movie(painterResource(id = R.drawable.spider_man2), "Spider-Man 2",
            2004, 2.07,Icons.Default.Favorite)

    )
    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        item {Text(text = "Movies", fontSize = 32.sp)
            }

        items(moviesList) {movie ->
            MovieRow(movies = movie)
            
        }


    }
}



@Composable
fun MovieRow(movies: Movie) {

    androidx.compose.foundation.Image(painter = movies.coverImage, contentDescription = "Cover image")
    Text(text = movies.name, fontSize = 20.sp)
    Text(text = " Was released in: " + movies.relaseYear.toString())
    Text(text = "Duration: " + movies.Time.toString())
    Icon(imageVector = movies.icon, contentDescription = "Heart icon")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MovieCollectionTheme {
        MovieList()
    }
}