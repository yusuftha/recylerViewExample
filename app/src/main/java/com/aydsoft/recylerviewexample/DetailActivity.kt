package com.aydsoft.recylerviewexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    companion object {
        fun startActivity(activity: AppCompatActivity, product: Product) {
            val intent = Intent(activity, DetailActivity::class.java)
            intent.putExtra("product", product)
            activity.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val product = intent.getSerializableExtra("product") as Product
        prepareDetailScreen(product)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onContextItemSelected(item)
    }

    private fun prepareDetailScreen(product: Product) {
        val ivProductImage = findViewById<ImageView>(R.id.imageView)
        val ivProductName = findViewById<TextView>(R.id.textView)
        val ivProductDetail = findViewById<TextView>(R.id.textView2)
        ivProductImage.setImageResource(product.image ?: 0)
        ivProductName.text = product.name
        ivProductDetail.text = product.recipe
    }
}