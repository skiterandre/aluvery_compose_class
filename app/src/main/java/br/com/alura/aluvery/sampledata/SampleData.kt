package br.com.alura.aluvery.sampledata

import br.com.alura.aluvery.R
import br.com.alura.aluvery.ui.model.Product
import java.math.BigDecimal


val sampleProducts = listOf(
    Product(
        name = "Hamburguer",
        price = BigDecimal(30.00),
        image = R.drawable.burger
    ),

    Product(
        name = "Fries",
        price = BigDecimal(15.99),
        image = R.drawable.fries
    ),

    Product(
        name = "Pizza",
        price = BigDecimal(35.55),
        image = R.drawable.pizza
    )
)