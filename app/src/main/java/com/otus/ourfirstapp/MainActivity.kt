package com.otus.ourfirstapp

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
//    val listview = mutableListOf<ImageView>(R.id.imageView)
    val list = mutableListOf<MovieItem>()

    val items = mutableListOf(
        MovieItem("Красота по-американски", "American Beauty\n" +
                "1999, драма, мелодрама, США", R.drawable.american_beauty),
        MovieItem("Гарри поттер и Философсий камень", "Harry Potter and the Sorcerer's Stone\n" +
                "2001, приключения, семейный, фэнтези, Великобритания, США", R.drawable.harry_potter_1),
        MovieItem("Название фильма 3", "Описание фильма 3", Color.GREEN),
        MovieItem("Название фильма 4", "Описание фильма 4", Color.YELLOW),
        MovieItem("Название фильма 5", "Описание фильма 5", Color.GRAY),
        MovieItem("Название фильма 6", "Описание фильма 6", Color.BLACK),
        MovieItem("Название фильма 7", "Описание фильма 7", Color.MAGENTA)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecycler()

    }

    private fun initRecycler() {
        val layoutManager = LinearLayoutManager( this, LinearLayoutManager.VERTICAL, false)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = MovieAdapter(items)
    }
}
