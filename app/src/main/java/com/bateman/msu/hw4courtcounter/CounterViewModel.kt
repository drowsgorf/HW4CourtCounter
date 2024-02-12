package com.bateman.msu.hw4courtcounter

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

const val CURRENT_TEAM_A_SCORE = "CURRENT_TEAM_A_SCORE"
const val CURRENT_TEAM_B_SCORE = "CURRENT_TEAM_B_SCORE"

class CounterViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {
    var teamAScore: Int
        get() = savedStateHandle.get(CURRENT_TEAM_A_SCORE) ?: 0
        set(value) = savedStateHandle.set(CURRENT_TEAM_A_SCORE, value)
    var teamBScore: Int
        get() = savedStateHandle.get(CURRENT_TEAM_B_SCORE) ?: 0
        set(value) = savedStateHandle.set(CURRENT_TEAM_B_SCORE, value)

    fun teamAScoreIncrease(score: Int) {
        teamAScore += score
    }

    fun teamBScoreIncrease(score: Int) {
        teamBScore += score
    }

    fun resetScore() {
        teamAScore = 0
        teamBScore = 0
    }
}