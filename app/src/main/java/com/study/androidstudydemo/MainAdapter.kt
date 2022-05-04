package com.study.androidstudydemo

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * @author wzh
 * @date 2022/5/4
 */
class MainAdapter(private val targetList: List<Target>) :
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {

        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_target, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val context = holder.itemView.context
        holder.tvTitle.text = targetList[position].title

        holder.itemView.setOnClickListener {
            context.startActivity(Intent(context,PracticeActivity::class.java))
        }
    }

    override fun getItemCount() = targetList.size


    class MainViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle: TextView = itemView.findViewById(R.id.tv_title)

    }
}