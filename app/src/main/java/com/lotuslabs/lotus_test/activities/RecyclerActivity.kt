package com.lotuslabs.lotus_test.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.lotuslabs.lotus_test.adapters.HobbiesAdapter
import com.lotuslabs.lotus_test.R
import com.lotuslabs.lotus_test.Supplier
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity: AppCompatActivity() {

    companion object {
        val TAG: String = RecyclerActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        listRecyclerView.layoutManager = layoutManager

        val adapter = HobbiesAdapter(this, Supplier.hobbies)
        listRecyclerView.adapter = adapter
    }
}
