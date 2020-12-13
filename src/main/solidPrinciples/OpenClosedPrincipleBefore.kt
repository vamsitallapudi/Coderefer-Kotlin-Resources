package main.solidPrinciples
//
//class Mariott {
//    private val basePrice = 2000
//    private val tax = 500
//    fun getPrice(): Int {
//        return basePrice + tax
//    }
//}
//class Taj {
//    private val basePrice = 3000
//    fun getPrice(): Int {
//        return basePrice
//    }
//}
//
//class Hyatt {
//    private val basePrice = 4000
//    private val parkingFee = 500
//    private val tax = 1000
//    fun getPrice(): Int {
//        return basePrice + parkingFee + tax
//    }
//}
//
//class PriceFactory {
//    fun calculateArea(hotels : List<Any>) : Int {
//        var price = 0
//        hotels.forEach {
//            price += when (it) {
//                is Mariott -> {
//                    it.getPrice()
//                }
//                is Taj -> {
//                    it.getPrice()
//                }
//                else -> {
//                    throw RuntimeException("Hotel Not Listed.")
//                }
//            }
//        }
//        return  price
//    }
//}
//
//fun main() {
//    print(PriceFactory().calculateArea(listOf(Mariott(), Taj())))
//}