package com.lotuslabs.lotus_test.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.lotuslabs.lotus_test.AppConstants
import com.lotuslabs.lotus_test.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity: AppCompatActivity() {

    companion object {
        val TAG: String = SecondActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //Safe cell ?.
        //Safe call with let ?.let { }

        val bundle: Bundle? = intent.extras

        bundle?.let {
            val msg = bundle.getString(AppConstants.SEND_MESSAGE_KEY)
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

            sentMessage.text = msg
        }
    }
}