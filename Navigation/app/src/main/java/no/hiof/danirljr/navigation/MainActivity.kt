package no.hiof.danirljr.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import no.hiof.danirljr.navigation.ui.HomeScreen
import no.hiof.danirljr.navigation.ui.LoginScreen
import no.hiof.danirljr.navigation.ui.theme.NavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavigationApp()
                }
            }
        }
    }
}

enum class Screens {
    Login,
    Home
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationApp() {
    val navController = rememberNavController()

    Scaffold(topBar = {
        TopAppBar(title = { "Navigation" })
    }) {innerPadding ->
        NavHost(navController = navController,
            startDestination = Screens.Login.name,
            Modifier.padding(innerPadding)) {
            composable(Screens.Login.name) { LoginScreen(login ={ navController.navigate(Screens.Home.name)}) }
            composable(Screens.Home.name) { HomeScreen() }
        }
    }

}


