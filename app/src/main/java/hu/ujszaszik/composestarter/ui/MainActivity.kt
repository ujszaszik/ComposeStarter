package hu.ujszaszik.composestarter.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.CompositionLocalProvider
import androidx.core.view.WindowCompat
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import hu.ujszaszik.composestarter.navigation.graph.ApplicationGraph
import hu.ujszaszik.composestarter.navigation.graph.LocalNavController

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            CompositionLocalProvider(LocalNavController provides rememberNavController()) {
                ApplicationGraph()
            }
        }
    }

    override fun onBackPressed() {
        viewModel.onBackPressed()
    }
}