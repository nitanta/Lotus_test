package com.lotuslabs.lotus_test
import android.app.Activity
import android.util.Log
import android.widget.Toast

fun Activity.showToast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Log.i("Activity", message)
    Toast.makeText(this, message, duration).show()
}