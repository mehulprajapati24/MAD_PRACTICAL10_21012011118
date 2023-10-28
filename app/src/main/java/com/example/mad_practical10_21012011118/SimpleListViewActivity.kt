package com.example.mad_practical10_21012011118

import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class SimpleListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_list_view)

        val listView:ListView = findViewById(R.id.listView)
//        val languageList = arrayOf<String>("C","C++","Java",".Net","Kotlin","Ruby","Rails","Python","Java Script","Php","Ajax","Perl","Hadoop")
//        val language:Array<String> = resources.getStringArray(R.array.array_technology)
////        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,languageList)
//        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,language)
//
//
//        listView.adapter = arrayAdapter
//        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, id ->
//            val selectedItem = adapterView.getItemAtPosition(position) as String
//            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
//
//            Toast.makeText(applicationContext,"click item $selectedItem its position $itemIdAtPos",Toast.LENGTH_SHORT).show()
//        }
        val fruits = arrayOf("Apple", "Banana", "Cherry", "Date", "Fig", "Grape")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, fruits)
        listView.adapter = adapter
    }
}
