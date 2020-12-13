package main.solidPrinciples.LiskovSubstitution
//
//open class Bird{
//    fun makeSound(){}
//    fun fly() {}
//}
//
//class Eagle : Bird()
//class Penguin : Bird() // fails LSP because it cannot fly therefore has different behaviour and cannot call fly() method