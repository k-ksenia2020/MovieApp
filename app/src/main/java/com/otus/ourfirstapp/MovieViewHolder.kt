package com.otus.ourfirstapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieViewHolder (itemView:View): RecyclerView.ViewHolder(itemView) {
    val title : TextView = itemView.findViewById(R.id.title)
    val description : TextView = itemView.findViewById(R.id.description)
    val image : ImageView = itemView.findViewById(R.id.imageView)

    fun bind(movieItem: MovieItem){
        title.text = movieItem.title
        description.text = movieItem.description
        image.setBackgroundColor(movieItem.color)
    }
}