package com.bateman.msu.hw4courtcounter


import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bateman.msu.hw4courtcounter.databinding.ActivityMainBinding
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val counterViewModel: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        displayForTeamA()
        displayForTeamB()
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    fun addOneForTeamA(v: View?) {
        counterViewModel.teamAScoreIncrease(1)
        displayForTeamA()
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    fun addTwoForTeamA(v: View?) {
        counterViewModel.teamAScoreIncrease(2)
        displayForTeamA()
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    fun addThreeForTeamA(v: View?) {
        counterViewModel.teamAScoreIncrease(3)
        displayForTeamA()
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    fun addOneForTeamB(v: View?) {
        counterViewModel.teamBScoreIncrease(1)
        displayForTeamB()
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    fun addTwoForTeamB(v: View?) {
        counterViewModel.teamBScoreIncrease(2)
        displayForTeamB()
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    fun addThreeForTeamB(v: View?) {
        counterViewModel.teamBScoreIncrease(3)
        displayForTeamB()
    }

    /**
     * Resets the score for both teams back to 0.
     */
    fun resetScore(v: View?) {
        counterViewModel.resetScore()
        displayForTeamA()
        displayForTeamB()
    }

    /**
     * Displays the given score for Team A.
     */
    private fun displayForTeamA() {
        binding.teamAScore.text = counterViewModel.teamAScore.toString()
    }

    /**
     * Displays the given score for Team B.
     */
    private fun displayForTeamB() {
        binding.teamBScore.text = counterViewModel.teamBScore.toString()
    }
}