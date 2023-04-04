package com.aydsoft.recylerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

private var productAdapter: ProductAdapter? = null

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        prepareRecyclerView()
    }

    private fun prepareRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        productAdapter = ProductAdapter(ApiData.productList)
        recyclerView.adapter = productAdapter
        productAdapter?.itemClickListener = object : ItemClickListener {
            override fun itemClick(product: Product) {
                println("MainActivity-x-product: $product")
                DetailActivity.startActivity(this@MainActivity, product)
            }
        }
    }
}