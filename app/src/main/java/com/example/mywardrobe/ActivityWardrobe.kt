package com.example.mywardrobe

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ActivityWardrobe : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private final lateinit var adapter: ClothingAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wardrobe)

        setSupportActionBar(findViewById(R.id.toolbar))

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val clothingList = populateClothingList()
        adapter = ClothingAdapter(clothingList)
        recyclerView.adapter = adapter
    }

    private fun populateClothingList(): List<ClothingItem> {
        val clothingList = mutableListOf<ClothingItem>()

        clothingList.add(ClothingItem(R.drawable.ic_launcher_background, "Рубашка", "Классическая рубашка"))
        clothingList.add(ClothingItem(R.drawable.ic_launcher_background, "Джинсы", "Модные джинсы"))
        clothingList.add(ClothingItem(R.drawable.ic_launcher_background, "Свитер", "Теплый свитер"))

        return clothingList
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_exit, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_exit) {
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}