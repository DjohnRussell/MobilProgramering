package no.hiof.danirljr.questify
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
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import no.hiof.danirljr.questify.ui.ui.Login
import no.hiof.danirljr.questify.ui.theme.QuestifyTheme
import no.hiof.danirljr.questify.ui.ui.CreateNewUser
import no.hiof.danirljr.questify.ui.ui.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuestifyTheme {
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


    enum class AppScreens {
        Login,
        Home,
        CreateNewUser
    }




    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun NavigationApp() {
        val navController = rememberNavController()




        Scaffold(topBar = {
            TopAppBar(title = { "Login" })
        }) {innerPadding ->
            NavHost(navController = navController,
                startDestination = AppScreens.Login.name,
                Modifier.padding(innerPadding)) {
                composable(AppScreens.Login.name) { Login(logo = painterResource(id = R.drawable.questify),
                    contentDescription = "logo", login ={ navController.navigate(AppScreens.Home.name)},
                    createAccount ={ navController.navigate(AppScreens.CreateNewUser.name)}) }
                composable(AppScreens.Home.name) { HomeScreen() }
                composable(AppScreens.CreateNewUser.name) { CreateNewUser() }
            }
        }



}





