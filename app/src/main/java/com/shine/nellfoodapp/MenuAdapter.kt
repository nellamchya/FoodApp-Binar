package com.shine.nellfoodapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.widget.ImageView
import android.widget.TextView

class MenuAdapter(private val menuItems: List<MenuItem>) :
    RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false)
        return MenuViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bind(menuItems[position])
    }

    override fun getItemCount(): Int = menuItems.size

    inner class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val menuItemImage: ImageView = itemView.findViewById(R.id.menuItemImage)
        private val menuItemName: TextView = itemView.findViewById(R.id.menuItemName)
        private val menuItemPrice: TextView = itemView.findViewById(R.id.menuItemPrice)
        private val menuItemRate: TextView = itemView.findViewById(R.id.menuItemRate)

        fun bind(menuItem: MenuItem) {
            menuItemImage.setImageResource(menuItem.imageResourceId)
            menuItemName.text = menuItem.name
            menuItemPrice.text = menuItem.price
            menuItemRate.text = menuItem.rate.toString()
        }
    }
}
