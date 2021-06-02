package com.example.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var todolist= mutableListOf(
            ToDo("Follow android devs",true),
            ToDo("Follow here",true),
            ToDo("Follow Jayant Jadhav",true),
            )
        val adapter=ToDoAdapter(todolist)
        rvToDo.adapter=adapter
        rvToDo.layoutManager=LinearLayoutManager(this)
        btnAddToDo.setOnClickListener {
            val title=etToDO.text.toString()
            val todo=ToDo(title,false)
            todolist.add(todo)
            adapter.notifyItemInserted(todolist.size-1)
        }
    }
}