package com.example.uf1_act6_textedit_guillemdehon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val button1 = findViewById<Button>(R.id.pimpon)

        button1.setOnClickListener{
            val enteredText = editText.text.toString()

            Toast.makeText(this,enteredText,Toast.LENGTH_SHORT).show()
        }
    }
}