package com.lab1.MarvelApp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lab1.MarvelApp.model.Images

class Adapter (private val context: Context, private val dataset: List<Images>)
    : RecyclerView.Adapter<Adapter.ViewHolder>() {
        class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val imgView: ImageView = view.findViewById(R.id.item_image)
        val textView: TextView = view.findViewById(R.id.item_name)
        }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.item, viewGroup, false))
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset[position]
        holder.imgView.setImageResource(item.imageResourceId)
        holder.textView.setText(item.stringResourceId)

    }

}