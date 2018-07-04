package com.example.michelleaca.courtcounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Increases the score of Team A by 3 points
        threePtsA_btn.setOnClickListener {
            scoreA += 3
            displayForTeamA(scoreA)
        }

        // Increases the score of Team A by 2 points
        twoPtsA_btn.setOnClickListener {
            scoreA += 2
            displayForTeamA(scoreA)
        }

        // Increases the score of Team A by 1 point
        freethrowA_btn.setOnClickListener {
            scoreA += 1
            displayForTeamA(scoreA)
        }

        // Increases the score of Team B by 3 points
        threePtsB_btn.setOnClickListener() {
            scoreB += 3
            displayForTeamB(scoreB)
        }

        // Increases the score of Team B by 2 points
        twoPtsB_btn.setOnClickListener {
            scoreB += 2
            displayForTeamB(scoreB)
        }

        // Increases the score of Team B by 1 point

        freethrowB_btn.setOnClickListener {
            scoreB += 1
            displayForTeamB(scoreB)
        }

        reset_btn.setOnClickListener {
            scoreA = 0
            scoreB = 0
            displayForTeamA(scoreA)
            displayForTeamB(scoreB)
        }
    }

    var scoreA = 0
    var scoreB = 0



    // defining methods

    //Displays the score of Team A
    private fun displayForTeamA(number: Int) {
        scoreA_textView.text = scoreA.toString()
    }
    //Displays the score of Team B
    private fun displayForTeamB(number: Int) {
        scoreB_textView.text = scoreB.toString()
    }

}
