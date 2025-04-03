
fun sayHelloImproved(greeting: String, vararg itemsToGreet: String) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting:String = "Welcome", person: String = "Kotlin") = println("$greeting, $person !")

fun main() {

    val interestingThings = arrayOf("Java", "Books", "Lemonade")

    sayHelloImproved("Hello")
    sayHelloImproved(greeting = "Hello", "Kotlin", "Programmers")
    sayHelloImproved("Hello", *interestingThings)

    greetPerson(person = "Andrej", greeting = "Welcome")
    greetPerson()

}