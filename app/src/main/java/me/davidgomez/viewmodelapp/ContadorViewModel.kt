package me.davidgomez.viewmodelapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ContadorViewModel : ViewModel() {

    var contador by mutableIntStateOf(0)
        private set

    fun incrementar() {
        contador++
    }

    fun decrementar() {
        contador--
    }

    fun reiniciar() {
        contador = 0
    }
}
