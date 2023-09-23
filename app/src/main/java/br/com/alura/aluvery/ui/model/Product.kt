package br.com.alura.aluvery.ui.model

import androidx.annotation.DrawableRes
import java.math.BigDecimal

data class Product(
    val name:String,
    val price:BigDecimal,
    @DrawableRes val image: Int
)
