package com.lotuslabs.lotus_test.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.lotuslabs.lotus_test.AppConstants
import com.lotuslabs.lotus_test.R
import com.lotuslabs.lotus_test.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG: String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToast.setOnClickListener {
            showToast("Button was clicked", Toast.LENGTH_SHORT)
        }

        sendMessageToNextActivity.setOnClickListener {
            showToast("Second button was clicked")

            val message = sendMessageToNextActivity.text.toString()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(AppConstants.SEND_MESSAGE_KEY, message)
            startActivity(intent)
        }

        showRecyclerView.setOnClickListener {
            Log.i(TAG, "Recycler view button was clicked")

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        shareToOtherApps.setOnClickListener {
            showToast("Share to other apps button was clicked")

            val message = sendMessageToNextActivity.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share to"))
        }
    }
}