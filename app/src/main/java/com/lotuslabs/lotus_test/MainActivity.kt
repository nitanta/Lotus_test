package com.lotuslabs.lotus_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToast.setOnClickListener {
            Log.i("Main Activity", "Button was clicked")
            Toast.makeText(this, "Button was clicked", Toast.LENGTH_LONG).show()
        }

        sendMessageToNextActivity.setOnClickListener {
            Log.i("Main Activity", "Second button was clicked")
            Toast.makeText(this, "Second button was clicked", Toast.LENGTH_SHORT).show()

            val message = sendMessageToNextActivity.text.toString()

            val intent = Intent(this, SecondActivity::class.java)

            startActivity(intent)

        }
    }
}