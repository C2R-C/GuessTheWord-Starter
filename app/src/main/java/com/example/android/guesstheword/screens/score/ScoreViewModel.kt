package com.example.android.guesstheword.screens.score

/**
 * ViewModel con constructor parametrizado. Esto quiere dcir que recibe un parámetro el cual es implementado en el ViewModel Factory
 */
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int): ViewModel() {

    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
    get() = _score

    init {
        _score.value = finalScore
    }
}