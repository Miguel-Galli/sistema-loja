package main.extensoes

import java.math.BigDecimal
import java.text.NumberFormat

fun BigDecimal.formataParaReal(): String{
    return NumberFormat.getCurrencyInstance().format(this)
}