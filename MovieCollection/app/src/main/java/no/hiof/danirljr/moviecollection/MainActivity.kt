package no.hiof.danirljr.moviecollection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
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
           1989, 1.44, Icons.Default.FavoriteBorder ),
        Movie(painterResource(id = R.drawable.batman_returns), "Batman Returns",
            1992, 2.06,Icons.Default.FavoriteBorder),
        Movie(painterResource(id = R.drawable.batman_forever), "Batman Forever",
            1995, 2.02,Icons.Default.FavoriteBorder),
        Movie(painterResource(id = R.drawable.batmanandrobin), "Batman & Robin",
            1997, 2.05,Icons.Default.FavoriteBorder),
        Movie(painterResource(id = R.drawable.spider), "Spider-Man",
            2002, 2.01,Icons.Default.FavoriteBorder),
        Movie(painterResource(id = R.drawable.spider_man2), "Spider-Man 2",
            2004, 2.07,Icons.Default.FavoriteBorder),
        Movie(painterResource(id = R.drawable.spider_man3), "Spider-Man 3",
            2007, 2.19, Icons.Default.FavoriteBorder)

    )


    Column(verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        LazyRow() {
            item { Text(modifier = Modifier, text = "Favorite´s", fontSize = 20.sp,
                fontWeight = FontWeight.Light) }
        }
        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            item {Text(text = "Movies", fontSize = 32.sp, fontWeight = FontWeight.W700,
                fontFamily = FontFamily.Monospace) }

            items(moviesList) {movie ->
                MovieRow(movies = movie)

            }
        }
    }
}

@Composable
fun IconHeart(isFavorite: Boolean, onIconClick: () -> Unit) {
    val iconResource = if (isFavorite) {
        Icons.Default.Favorite
    } else {
        Icons.Default.FavoriteBorder
    }

    Icon(
        imageVector = iconResource,
        contentDescription = "Heart icon",
        modifier = Modifier.clickable {
            onIconClick()
        }
    )
}

@Composable
fun MovieRow(movies: Movie) {
    var isFavorite by rememberSaveable { mutableStateOf(false) }


    Card {
        androidx.compose.foundation.Image(
            painter = movies.coverImage,
            contentDescription = "Cover image",
            alignment = Alignment.TopCenter
        )
        Text(text = movies.name, fontSize = 20.sp, color = DarkGray)
        Text(text = " Was released in: " + movies.relaseYear.toString())
        Text(text = "Duration: " + movies.Time.toString())

        IconHeart(isFavorite) {
            isFavorite = !isFavorite


        }
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MovieCollectionTheme {
        MovieList()
    }
}