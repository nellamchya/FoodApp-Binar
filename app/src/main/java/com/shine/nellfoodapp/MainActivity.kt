package com.shine.nellfoodapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerViewCategory = findViewById<RecyclerView>(R.id.recyclerViewCategory)
        val recyclerViewMenu = findViewById<RecyclerView>(R.id.recyclerViewMenu)

        val kategoriList = listOf(
            Category("Rice", R.drawable.rice),
            Category("Burger", R.drawable.burger),
            Category("Snack", R.drawable.snack),
            Category("Drink", R.drawable.drink)
        )

        val menuList = listOf(
            MenuItem("Ayam Goreng", "Rp 50,000", R.drawable.ayam, "5.0"),
            MenuItem("Ayam Bakar", "Rp 40,000", R.drawable.bakar, "4.9"),
            MenuItem("Ayam Geprek", "Rp 35,000", R.drawable.geprek, "4.8"),
            MenuItem("Sate Usus", "Rp 15,000", R.drawable.usus, "4.7")
        )

        val categoryAdapter = CategoryAdapter(kategoriList)
        recyclerViewCategory.adapter = categoryAdapter
        val layoutManagerCategory = GridLayoutManager(this, 4)
        recyclerViewCategory.layoutManager = layoutManagerCategory


        val menuAdapter = MenuAdapter(menuList)
        recyclerViewMenu.adapter = menuAdapter
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        recyclerViewMenu.layoutManager = linearLayoutManager
    }
}
