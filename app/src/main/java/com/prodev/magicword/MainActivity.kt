package com.prodev.magicword

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var tryLeft = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUi()
    }

    private fun setUi() {

        val correctAnswer = "jim"

        ok_btn.setOnClickListener {

            if (password_View.text.toString().toLowerCase() == correctAnswer.toLowerCase()) {


                password_View.isEnabled = false
                ok_btn.isEnabled = false
                message_tv.text = "Congratulations"

            }else{
                tryLeft --
                password_View.text.clear()
                Toast.makeText(this,"${tryLeft} Times Left, Try Again", Toast.LENGTH_LONG).show()

                if(tryLeft ==0) {
                    password_View.isEnabled = false
                    ok_btn.isEnabled = false
                    message_tv.text = "You Lost.  Game Over"
                }
            }

        }
    }
}