package com.lotuslabs.lotus_test

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
    }
}