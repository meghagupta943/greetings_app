package com.example.bday_greets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createHBDcard(view: View) {

        //finding EditText
        val nameInput=findViewById<EditText>(R.id.nameInput)
        val name= nameInput.editableText.toString()
//        var name= findViewById<EditText>(R.id.nameInput)
//        Toast.makeText(this, " Name is ${name.text}", Toast.LENGTH_LONG).show()

        //intent is like creating interface between 2 pages
        val intent =Intent(this, birthdayMessageActivity::class.java )
        intent.putExtra(birthdayMessageActivity.NAME_EXTRA, name)
        startActivity(intent)

    }

    fun sayCongratsCard(view: View) {
        //finding EditText
        val nameInput=findViewById<EditText>(R.id.nameInput)
        val name= nameInput.editableText.toString()

        val intent =Intent(this, congratsMessageActivity::class.java )
        intent.putExtra(congratsMessageActivity.NAME_EXTRA, name)
        startActivity(intent)


    }
}