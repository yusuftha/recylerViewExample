package com.aydsoft.recylerviewexample

import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("yaziBoyut")
fun TextView.yaziBoyutu(size: Int) {
    textSize = size.toFloat()
}