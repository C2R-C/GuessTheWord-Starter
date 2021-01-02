package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel: ViewModel() {

    // The current word
    var word = MutableLiveData<String>()
    // The current score. Para uso de LiveData se cambia el tipo
    var score = MutableLiveData<Int>()
    // The list of words - the front of the list is the next word to guess
    private lateinit var wordList: MutableList<String>

    init {
        word.value = ""
        score.value = 0
        resetList()
        nextWord()
        Log.i("GameViewModel", "GameViewModel Created")
    }

    /**
     * Resets the list of words and randomizes the order
     */
    private fun resetList() {
        wordList = mutableListOf(
                "queen",
                "hospital",
                "basketball",
                "cat",
                "change",
                "snail",
                "soup",
                "calendar",
                "sad",
                "desk",
                "guitar",
                "home",
                "railway",
                "zebra",
                "jelly",
                "car",
                "crow",
                "trade",
                "bag",
                "roll",
                "bubble"
        )
        wordList.shuffle()
    }

    /**
     * Moves to the next word in the list
     */
    private fun nextWord() {
        if (!wordList.isEmpty()) {
            //Select and remove a word from the list
                // Así mismo, se adiciona propiedad value al objeto word
            word.value = wordList.removeAt(0)
        }

    }

    /** Methods for buttons presses **/

    fun onSkip() {
        /** Como el tipo cambió, así mismo se cambia el decremento de score-- usando la función
         * minus() que realiza la resta null-safety
         */
        score.value = (score.value)?.minus(1)
        nextWord()
    }

    fun onCorrect() {
        score.value = (score.value)?.plus(1)
        nextWord()
    }


    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel", "GameViewModel destroyed")
    }
}