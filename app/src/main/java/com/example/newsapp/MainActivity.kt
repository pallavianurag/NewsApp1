package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NewsItemClicked {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var recyclerView = findViewById<>()
        recyclerView.LayoutManager = LinearLayoutManager(this)
        val items = FetchData()
        val adapter:NewsListAdapter = NewsListAdapter(items)
        recyclerView.adapter=adapter
    }
    private fun FetchData(): ArrayList<String> {
        val list = ArrayList<String>()
        for(i in 0 until 10){
            list.add("Item $i")
        }
        return list
    }

    override fun onItemClicked(item: String) {
        TODO("Not yet implemented")
    }
}


