package com.example.belajarandroidgeovani

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var nameEditText: EditText
    private lateinit var buttonButton: Button
    private lateinit var buttonTextView: TextView

    private fun initComponents() {
        nameEditText = findViewById(R.id.nameEditText)
        buttonButton = findViewById(R.id.buttonButton)
        buttonTextView = findViewById(R.id.buttonTextView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_world)

        initComponents()

        buttonTextView.text = getString(R.string.app_name)

        buttonButton.setOnClickListener {
            val name = nameEditText.text.toString()
            buttonTextView.text = name

            val namesArray = resources.getStringArray(R.array.names)
            namesArray.forEach {
                Log.i("PZN", it)
            }
        }
    }
}
