package com.example.android.guesstheword.screens.score

/**
 * ViewModel con constructor parametrizado. Esto quiere dcir que recibe un parámetro el cual es implementado en el ViewModel Factory
 */
import android.util.Log
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int): ViewModel() {

    var score = finalScore

    init {
        Log.i("ScoreViewModel", "Final score is $finalScore")
    }
}