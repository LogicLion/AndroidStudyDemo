package com.study.androidstudydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.study.androidstudydemo.bean.Target
import com.study.androidstudydemo.fragment.*

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

        list.add(Target("Activity的生命周期", Test1Fragment::class.java.name))
        list.add(Target("Activity通过intent传递参数", Test2Fragment::class.java.name))
        list.add(Target("Activity的4种启动模式", Test3Fragment::class.java.name))
        list.add(Target("Fragment的生命周期", Test4Fragment::class.java.name))
        list.add(Target("Activity给Fragment传值", Test5Fragment::class.java.name))
        list.add(Target("切换Fragment", Test6Fragment::class.java.name))
        list.add(Target("服务service", Test7Fragment::class.java.name))
        list.add(Target("drawable的使用", Test8Fragment::class.java.name))
        list.add(Target("Handler的使用", Test6Fragment::class.java.name))
        list.add(Target("SharePreferences的使用", Test6Fragment::class.java.name))
        list.add(Target("ImageView的使用", Test6Fragment::class.java.name))
        list.add(Target("recyclerView的使用", Test6Fragment::class.java.name))
        list.add(Target("Viewpager的使用", Test6Fragment::class.java.name))
        list.add(Target("dataBinding的使用", Test6Fragment::class.java.name))
        list.add(Target("使用glide进行网络图片加载", Test6Fragment::class.java.name))
        list.add(Target("用gson框架进行Json解析", Test6Fragment::class.java.name))
        list.add(Target("使用retrofit进行网络请求", Test6Fragment::class.java.name))
        list.add(Target("学习rxjava的使用", Test6Fragment::class.java.name))
        list.add(Target("结合retrofit和rxjava进行网络请求", Test6Fragment::class.java.name))

        return list
    }
}