package com.aydsoft.recylerviewexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(
    var list: MutableList<Product> = mutableListOf(),
    var itemClickListener: ItemClickListener? = null
) : RecyclerView.Adapter<ProductAdapter.VH>() {

    inner class VH(private val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(product: Product) {
            val ivProductImage = view.findViewById<ImageView>(R.id.itemImage)
            val tvProductName = view.findViewById<TextView>(R.id.itemTitle)
            val tvProductPrice = view.findViewById<TextView>(R.id.itemDetail)
            ivProductImage.setImageResource(product.image ?: 0)
            tvProductName.text = product.name
            tvProductPrice.text = product.desc

            view.setOnClickListener {
                itemClickListener?.itemClick(product)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)
        return VH(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val product = list[position]
        holder.bind(product)
    }
}

