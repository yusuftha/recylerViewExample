package com.aydsoft.recylerviewexample
import androidx.annotation.DrawableRes
import java.io.Serializable

data class Product(
    var id: Int? = (1..1000).random(),
                   var name: String? = null,
                   var desc: String? = null,
                   var recipe: String? = null,
                   @DrawableRes var image: Int? = null): Serializable