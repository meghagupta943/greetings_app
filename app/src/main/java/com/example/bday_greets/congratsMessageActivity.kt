package com.example.bday_greets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class congratsMessageActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA ="name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congrats_message)

        //finding congratsMsg
        val congratsMsg=findViewById<TextView>(R.id.congratsMsg)

        val name=intent.getStringExtra(NAME_EXTRA)
        congratsMsg.text= "Congratulations, \n$name !"

    }
}