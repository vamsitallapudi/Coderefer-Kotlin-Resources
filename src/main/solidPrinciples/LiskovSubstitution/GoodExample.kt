package main.leetcode.kotlin.solidPrinciples.LiskovSubstitution

open class Bird{
    fun makeSound(){}
}

open class FlyingBird : Bird() {
    fun fly() {}
}

class Eagle : FlyingBird()
class Penguin : Bird()

fun main() {
    var x = Eagle().fly()
}