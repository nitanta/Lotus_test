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
            intent.putExtra("SendMessage", message)
            startActivity(intent)

        }

        showRecyclerView.setOnClickListener {
            Log.i("Main Activity", "Recycler view button was clicked")

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        shareToOtherApps.setOnClickListener {
            Log.i("Main Activity", "Share to other apps button was clicked")
            Toast.makeText(this, "Share to other apps button was clicked", Toast.LENGTH_SHORT).show()

            val message = sendMessageToNextActivity.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share to"))

        }
    }
}