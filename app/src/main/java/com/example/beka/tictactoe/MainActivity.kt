package com.example.beka.tictactoe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var isFirstPlayer = true

    var player1 = 0
    var player2 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    protected fun init() {
        initializeButtons()
    }

    private fun initializeButtons() {
        button1.setOnClickListener {
            onClick(button1)
        }
        button2.setOnClickListener {
            onClick(button2)
        }
        button3.setOnClickListener {
            onClick(button3)
        }
        button4.setOnClickListener {
            onClick(button4)
        }
        button5.setOnClickListener {
            onClick(button5)
        }
        button6.setOnClickListener {
            onClick(button6)
        }
        button7.setOnClickListener {
            onClick(button7)
        }
        button8.setOnClickListener {
            onClick(button8)
        }
        button9.setOnClickListener {
            onClick(button9)
        }
        resetbutton.setOnClickListener {
            // reset the game
            restartTheGame()
        }
    }

    private fun onClick(button: Button) {

        if (isFirstPlayer) {
            button.text = "X"
            choiseOfPlayer.text = "player 2"
            isFirstPlayer = false
        } else {
            button.text = "O"
            choiseOfPlayer.text = "player 1"
            isFirstPlayer = true
        }

        // make button unclickable
        button.isClickable = false

        // check game state
        checkGameState()
    }

    private fun checkGameState() {

        if (!button1.text.toString().isEmpty() && button1.text.toString().equals(button2.text.toString()) && button2.text.toString().equals(button3.text.toString()))
            showMessage(button1.text.toString())
        else
        if (!button4.text.toString().isEmpty() && button4.text.toString().equals(button5.text.toString()) && button5.text.toString().equals(button6.text.toString()))
            showMessage(button4.text.toString())
        else
        if (!button7.text.toString().isEmpty() && button7.text.toString().equals(button8.text.toString()) && button8.text.toString().equals(button9.text.toString()))
            showMessage(button7.text.toString())
        else
        if (!button1.text.toString().isEmpty() && button1.text.toString().equals(button4.text.toString()) && button4.text.toString().equals(button7.text.toString()))
            showMessage(button1.text.toString())
        else
        if (!button2.text.toString().isEmpty() && button2.text.toString().equals(button5.text.toString()) && button5.text.toString().equals(button8.text.toString()))
            showMessage(button1.text.toString())
        else
        if (!button3.text.toString().isEmpty() && button3.text.toString().equals(button6.text.toString()) && button6.text.toString().equals(button9.text.toString()))
            showMessage(button1.text.toString())
        else
        if (!button1.text.toString().isEmpty() && button1.text.toString().equals(button5.text.toString()) && button5.text.toString().equals(button9.text.toString()))
            showMessage(button1.text.toString())
        else
        if (!button3.text.toString().isEmpty() && button3.text.toString().equals(button5.text.toString()) && button5.text.toString().equals(button7.text.toString()))
            showMessage(button3.text.toString())
        else
        // cehck if every space is taken
        // and reset the game
            if (!button1.text.toString().isEmpty() && !button2.text.toString().isEmpty() && !button3.text.toString().isEmpty() && !button4.text.toString().isEmpty() && !button5.text.toString().isEmpty() && !button6.text.toString().isEmpty() && !button7.text.toString().isEmpty() && !button8.text.toString().isEmpty() && !button9.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Tie", Toast.LENGTH_LONG).show()
                restartTheGame()
            }
    }


    private fun showMessage(txt: String) {
        Toast.makeText(applicationContext, txt + " Has Won!", Toast.LENGTH_LONG).show()

        if(txt.equals("X")){
            player1 += 1
        }else{
            player2 += 1
        }

        restartTheGame()
    }

    private fun restartTheGame (){
        // show score
        player1Score.text = "Player1: " + player1
        player2Score.text = "Player2: " + player2

        // give first choice to winner
        isFirstPlayer = player1 >= player2

        button1.isClickable = true
        button1.text = ""

        button2.isClickable = true
        button2.text = ""

        button3.isClickable = true
        button3.text = ""

        button4.isClickable = true
        button4.text = ""

        button5.isClickable = true
        button5.text = ""

        button6.isClickable = true
        button6.text = ""

        button7.isClickable = true
        button7.text = ""

        button8.isClickable = true
        button8.text = ""

        button9.isClickable = true
        button9.text = ""

        checkGameState()
    }
}
