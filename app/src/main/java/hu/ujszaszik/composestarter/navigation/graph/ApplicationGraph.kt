package hu.ujszaszik.composestarter.navigation.graph

import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import hu.ujszaszik.composestarter.navigation.composable
import hu.ujszaszik.composestarter.ui.MainHost

val LocalNavController =
    compositionLocalOf<NavHostController> { error("LocalComposition NavController not present") }

@Composable
fun ApplicationGraph() {

    val navController = LocalNavController.current

    NavHost(navController = navController, startDestination = MainHost.route) {

        composable(MainHost) {
            MainHost()
        }
    }

}