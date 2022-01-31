package com.egeperk.kotlincityapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.egeperk.kotlincityapp.databinding.RecyclerRowBinding

class CityAdapter(val landmarksArrayList: ArrayList<Cities>) : RecyclerView.Adapter<CityAdapter.ViewHolder>() {


    class ViewHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.recyclerViewTextView.text = landmarksArrayList.get(position).name
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,CityDetailActivity::class.java)
            intent.putExtra("city",landmarksArrayList.get(position))
            holder.itemView.context.startActivity(intent)
        }
        }


    override fun getItemCount(): Int {
        return landmarksArrayList.size
    }

}


