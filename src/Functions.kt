// Top Level Functions
fun getName() = "Kotlin" // single expression function

fun sayHello(name: String): Unit { // Unit is redundant
    val message = "Hello $name" // same as "Hello " + $name
    println(message)
}

fun sayHello(greeting: String, itemsToGreet: String) = println("$greeting $itemsToGreet")

fun main() {
    sayHello(getName())
    sayHello("World")
    sayHello("Bye", "Kotlin")
    sayHello("Bye", "World")
}