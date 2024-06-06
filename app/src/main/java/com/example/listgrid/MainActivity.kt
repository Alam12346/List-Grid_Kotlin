package com.example.listgrid

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

val recycleView = findViewById<RecyclerView>(R.id.recycler_view)
//                recycleView.layoutManager = LinearLayoutManager( this)
        recycleView.layoutManager = GridLayoutManager(this, 2)
        recycleView.setHasFixedSize(true)

        val itemList = listOf(

            ItemList(  "Taman Nasional Wakatobi",  "Taman Nasional Wakatobi di sulawesi tenggara",
                "https://anekatempatwisata.com/wp-content/uploads/2020/01/Pantai-kepulauan-wakatobi-1-1024x685.jpg"),
            ItemList( "Pulau Komodo", "Pulau Komodo di sekitar kepulauan Nusa Tenggara",
                "https://anekatempatwisata.com/wp-content/uploads/2014/10/Pantai-Pink-Pulau-Komodo.jpg"),
            ItemList( "Trio Gili", "Trio Gili di Lombok",
                "https://anekatempatwisata.com/wp-content/uploads/2014/10/Gili-Lombok.jpg"),
            ItemList( "Raja Ampat", "Raja Ampat kumpulan dari  pulau pulau ujung di papua",
                "https://anekatempatwisata.com/wp-content/uploads/2014/10/Raja-Ampat.jpg")

        )
        val adapter= AdapterList(itemList)
        recycleView.adapter = adapter
    }
}