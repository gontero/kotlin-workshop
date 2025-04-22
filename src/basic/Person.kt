package basic

class Person(_firstName: String, _lastName: String) {
    val firstName: String // = _firstName
    val lastName: String // = _lastName

    init {
        firstName = _firstName
        lastName = _lastName
    }

}

public class PublicClass // public is default
internal class InternalClass
private class PrivateClass

class ShortPerson(val firstName: String = "Peter", val lastName: String = "Pan") {
    init {
        println("primary constructor init 1")
    }
    constructor(): this("Peter", "Short"){
        println("secondary constructor")
    }
    init {
        println("primary constructor init 2")
    }

    public var publicVar: String = "internal" // public is default
    internal var internalVar: String = "internal"
    protected var protectedVar: String = "internal"
    private var privateVar: String = "internal"

    var nickname: String? = null
        set(value) {
            field = value
            println("the new nickname is $value")
        }
        get() {
            println("the returned value is $field")
            return field
        }

    fun printInfo() {
        val nicknameToPrint = nickname ?: "no nickname"
        println("Info of person, $firstName $lastName \"$nicknameToPrint\"")
    }

    internal fun internalInfo() {
        println("Internal info")
    }

    protected fun protectedInfo() {
        println("Protected info")
    }

    private fun privateInfo() {
        println("Private info")
    }
}

fun main() {
    val person = Person("John", "Doe")
    println("Hello, ${person.firstName} ${person.lastName}")


    val shortPerson = ShortPerson()
    shortPerson.printInfo()
    shortPerson.publicVar
    shortPerson.internalVar
    //shortPerson.protectedVar
    //shortPerson.privateVar

    shortPerson.nickname = "Shorty"
    println("Hello, ${shortPerson.firstName} ${shortPerson.lastName} \"${shortPerson.nickname}\"")

    shortPerson.printInfo()
    shortPerson.internalInfo()
//    shortPerson.protectedInfo()
//    shortPerson.privateInfo()
}
