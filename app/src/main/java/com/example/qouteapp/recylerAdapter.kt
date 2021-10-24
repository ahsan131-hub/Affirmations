package com.example.qouteapp

import android.content.Context
import android.service.autofill.Dataset
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class recylerAdapter (
    private val context: Context,
    private val dataset: List<Affirmation>
    ):RecyclerView.Adapter<recylerAdapter.ItemViewHolder>(){

    class ItemViewHolder(private  val view: View):RecyclerView.ViewHolder(view) {
        val textView : TextView =view.findViewById(R.id.description)
        val imageView:ImageView=view.findViewById(R.id.image)
        init {
            view.setOnClickListener{
                val pos:Int =adapterPosition
                Toast.makeText(view.context,"Item position is ${pos}",Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
       val adapterLayout=LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item,parent,false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
       val item =dataset[position]
        holder.textView.text=context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}