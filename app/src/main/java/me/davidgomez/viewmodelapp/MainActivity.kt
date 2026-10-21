package me.davidgomez.viewmodelapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.lifecycle.viewmodel.compose.viewModel
import me.davidgomez.viewmodelapp.ui.theme.ViewModelAppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val contadorViewModel: ContadorViewModel = viewModel()

            ViewModelAppTheme {
                Surface {
                    ContadorScreen(
                        viewModel = contadorViewModel
                    )
                }
            }
        }
    }
}
