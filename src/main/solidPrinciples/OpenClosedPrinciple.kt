package main.leetcode.kotlin.solidPrinciples

interface Hotel {
    fun getPrice(): Int
}

class Mariott : Hotel {
    private val basePrice = 2000
    private val tax = 500
    override fun getPrice(): Int {
        return basePrice + tax
    }
}

class Taj : Hotel {
    private val basePrice = 3000
    override fun getPrice(): Int {
        return basePrice
    }
}

class Hyatt : Hotel {
    private val basePrice = 4000
    private val parkingFee = 500
    private val tax = 1000
    override fun getPrice(): Int {
        return basePrice + parkingFee + tax
    }
}

class PriceFactory {
    fun calculatePrices(hotels: List<Hotel>): Int {
        var totalPrice = 0
        hotels.forEach {
            totalPrice += it.getPrice()
        }
        return totalPrice
    }
}

fun main() {
    print(PriceFactory().calculatePrices(listOf(Mariott(), Taj(), Hyatt())))
}
