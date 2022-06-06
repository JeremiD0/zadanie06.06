package com.example.zadanie0606

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textinput = findViewById<EditText>(R.id.EnterTXT);
        val textbtn = findViewById<Button>(R.id.enterBtn);

        textbtn.setOnClickListener {
            textbtn.text = textinput.text.toString();
        }
    }
}