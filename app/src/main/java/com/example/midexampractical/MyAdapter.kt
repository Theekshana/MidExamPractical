package com.example.midexampractical

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val countries: List<String>, val flags: List<Int>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(row: View) : RecyclerView.ViewHolder(row) {
        val countries:TextView = row.findViewById(R.id.number)
        val flags:ImageView = row.findViewById(R.id.image)
        val checkBox:CheckBox = row.findViewById(R.id.checkBox)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_view,
            parent, false)
        return MyViewHolder(layout)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.countries.text = countries[position]
        holder.flags.setImageResource(flags[position])
    }

    override fun getItemCount(): Int = countries.size

}