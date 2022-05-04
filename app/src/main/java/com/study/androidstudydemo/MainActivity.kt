package com.study.androidstudydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rv = findViewById<RecyclerView>(R.id.rv)

        rv.layoutManager=LinearLayoutManager(this)
        rv.adapter=MainAdapter(getList())


    }


    private fun getList(): List<Target>{
        val list = mutableListOf<Target>()

        list.add(Target("Activity的生命周期"))
        list.add(Target("Fragment的使用"))

        return list
    }
}