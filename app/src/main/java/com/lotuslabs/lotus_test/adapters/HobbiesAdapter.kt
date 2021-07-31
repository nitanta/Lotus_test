package com.lotuslabs.lotus_test.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.lotuslabs.lotus_test.Hobby
import com.lotuslabs.lotus_test.R
import com.lotuslabs.lotus_test.activities.MainActivity
import kotlinx.android.synthetic.main.list_item.view.*

class HobbiesAdapter(val context: Context, val hobbies: List<Hobby>): RecyclerView.Adapter<HobbiesAdapter.MyViewHolder> () {

    companion object {
        val TAG: String = HobbiesAdapter::class.java.simpleName
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby = hobbies[position]
        holder.setData(hobby, position)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var currentHobby: Hobby? = null
        var currentPosition: Int = 0

        init {
            itemView.setOnClickListener {
                    Toast.makeText(context, currentHobby!!.title + " Clicked", Toast.LENGTH_SHORT).show()
            }
            itemView.imgShare.setOnClickListener {

                currentHobby?.let {
                    val message = currentHobby.title + " Clicked"

                    val intent = Intent()
                    intent.action = Intent.ACTION_SEND
                    intent.putExtra(Intent.EXTRA_TEXT, message)
                    intent.type = "text/plain"
                    context.startActivity(Intent.createChooser(intent, "Share to"))
                }
            }
        }

        fun setData(hobby: Hobby?, position: Int) {
            hobby?.let {
                itemView.txvTitle.text = hobby!!.title
                currentHobby = hobby
                currentPosition = position
            }
        }

    }

}
