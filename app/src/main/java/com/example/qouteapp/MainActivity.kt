package com.example.qouteapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init dataset
        val myDataSet=Affirmations().loadAffirmations()

        val recylerView=findViewById<RecyclerView>(R.id.recycler_view)
        recylerView.adapter=recylerAdapter(this,myDataSet)
        recylerView.setHasFixedSize(true)
        val numbers = listOf(1, 2, 3)
    }
}