package com.example.bday_greets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class birthdayMessageActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA ="name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_message)

        //finding birthdayGreeting
        val birthdayGreeting=findViewById<TextView>(R.id.birthdayGreeting)

        val name=intent.getStringExtra(NAME_EXTRA)
        birthdayGreeting.text= "Happy Birthday \n$name !"
    }
}