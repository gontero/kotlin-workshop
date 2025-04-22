package basic

// top level variable
val name = "Gregory"
// var greeting: String = null will not compile
var greeting: String? = null

fun main() {
    // if statement
    if(greeting != null) {
        println(greeting)
    } else {
        println("greeting is null")
    }
    println(name)

    greeting = "Hi"
    println(greeting)

    // when statement
    when(greeting) {
        null -> println("greeting is null")
        else -> println(greeting)
    }

    // assign if and when to a val
    val greetingToPrint = if(greeting != null) greeting else "Hello"
    println(greetingToPrint)

    val greetingToPrintWhen = when(greeting) {
        null -> "Hello"
        else -> greeting
    }
    println(greetingToPrintWhen)

    // local variable
    val name: String = "Andrej"
    // name = "Petr" //val is immutable
    println(name)

    var nameMutable: String = "Andrej"
    println(nameMutable)

    nameMutable = "Pete"
    println(nameMutable)
}