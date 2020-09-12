package com.otus.ourfirstapp

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter (private val items: List<MovieItem>): RecyclerView.Adapter<MovieViewHolder>() {
    companion object {
        const val TAG = "MovieAdapter"
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        Log.d(TAG, "onCreateViewHolder $viewType")
        val inflater = LayoutInflater.from(parent.context)
        return MovieViewHolder(inflater.inflate(R.layout.item_movie, parent,false))
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        Log.d(TAG, "onBindViewHolder $position")
        holder.bind(items[position])
    }
}