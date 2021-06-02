package com.example.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.itemtodo.view.*

class ToDoAdapter(
    val todo:List<ToDo>
):RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder>() {
    inner class ToDoViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.itemtodo,parent,false)
        return ToDoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        holder.itemView.apply {
            tvTitle.text=todo[position].title
            cbDone.isChecked=todo[position].isChecked
        }
    }

    override fun getItemCount(): Int {
        return todo.size
    }

}