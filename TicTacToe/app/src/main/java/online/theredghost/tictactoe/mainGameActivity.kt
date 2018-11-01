package online.theredghost.tictactoe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_game.*

class mainGameActivity : AppCompatActivity() {

    var isFirst = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_game)
        init()
    }

    private fun init() {
        resetTheGame()

        gameplay()
    }

    private fun resetTheGame() {
        button1.text = ""
        button2.text = ""
        button3.text = ""
        button4.text = ""
        button5.text = ""
        button6.text = ""
        button7.text = ""
        button8.text = ""
        button9.text = ""

    }

    private fun gameplay() {

        button1.setOnClickListener {
            onButtonPress(button1)
        }

        button2.setOnClickListener {
            onButtonPress(button2)
        }

        button3.setOnClickListener {
            onButtonPress(button3)
        }

        button4.setOnClickListener {
            onButtonPress(button4)
        }

        button5.setOnClickListener {
            onButtonPress(button5)
        }

        button6.setOnClickListener {
            onButtonPress(button6)
        }

        button7.setOnClickListener {
            onButtonPress(button7)
        }

        button8.setOnClickListener {
            onButtonPress(button8)
        }

        button9.setOnClickListener {
            onButtonPress(button9)
        }
    }

    private fun onButtonPress(button: Button) {

        if (isFirst && button.text.toString().isEmpty()) {
            button.text = "X"
            isFirst = false
            checkGameState()
        } else if (!isFirst && button.text.toString().isEmpty()) {
            button.text = "O"
            isFirst = true
            checkGameState()
        }


    }

    private fun checkGameState() {

        //check vertical 1 4 7
        if(button1.text.isEmpty() == false && button1.text.toString().equals(button4.text.toString()) && button4.text.toString().equals(button7.text.toString())){
            Toast.makeText(applicationContext,button1.text.toString() + " Has won",Toast.LENGTH_LONG).show()
            resetTheGame()
        }
        else
        //check vertical 2 5 8
        if(!button2.text.isEmpty() && button2.text.toString().equals(button5.text.toString()) && button5.text.toString().equals(button8.text.toString())){
            Toast.makeText(applicationContext,button2.text.toString() + " Has won",Toast.LENGTH_LONG).show()
            resetTheGame()
        }
        else
        //check vertical 3 6 9
        if(!button3.text.isEmpty() && button3.text.toString().equals(button6.text.toString()) && button6.text.toString().equals(button9.text.toString())){
            Toast.makeText(applicationContext,button3.text.toString() + " Has won",Toast.LENGTH_LONG).show()
            resetTheGame()
        }
        else
        //check horizontal 1 2 3
        if(!button1.text.isEmpty() && button1.text.toString().equals(button2.text.toString()) && button2.text.toString().equals(button3.text.toString())){
            Toast.makeText(applicationContext,button1.text.toString() + " Has won",Toast.LENGTH_LONG).show()
            resetTheGame()
        }
        else
        //check horizontal 4 5 6
        if(!button4.text.isEmpty() && button4.text.toString().equals(button5.text.toString()) && button5.text.toString().equals(button6.text.toString())){
            Toast.makeText(applicationContext,button4.text.toString() + " Has won",Toast.LENGTH_LONG).show()
            resetTheGame()
        }
        else
        //check horizontal 7 8 9
        if(!button7.text.isEmpty() && button7.text.toString().equals(button8.text.toString()) && button8.text.toString().equals(button9.text.toString())){
            Toast.makeText(applicationContext,button7.text.toString() + " Has won",Toast.LENGTH_LONG).show()
            resetTheGame()
        }
        else
        //check diagonal 1 5 9
        if(!button1.text.isEmpty() && button1.text.toString().equals(button5.text.toString()) && button5.text.toString().equals(button9.text.toString())){
            Toast.makeText(applicationContext,button1.text.toString() + " Has won",Toast.LENGTH_LONG).show()
            resetTheGame()
        }
        else
        //check diagonal 3 5 7
        if(!button3.text.isEmpty() && button3.text.toString().equals(button5.text.toString()) && button5.text.toString().equals(button7.text.toString())){
            Toast.makeText(applicationContext,button3.text.toString() + " Has won",Toast.LENGTH_LONG).show()
            resetTheGame()
        }
        else
            if(!button1.text.toString().isEmpty() && !button2.text.toString().isEmpty() && !button3.text.toString().isEmpty() && !button4.text.toString().isEmpty() && !button5.text.toString().isEmpty() && !button6.text.toString().isEmpty() && !button7.text.toString().isEmpty() && !button8.text.toString().isEmpty() && !button9.text.toString().isEmpty()){
                Toast.makeText(applicationContext,"Tie",Toast.LENGTH_LONG).show()
                resetTheGame()
            }
    }
}
