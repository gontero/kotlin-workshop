interface PersonInfoProvider {
    val providerInfo: String
    fun printInfo(person: Person) {
        println("default implementation of $providerInfo")
    }
}

interface SessionInfoProvider {
    fun getSessionId(): String
}

abstract class AbstractBasicInfoProvider: PersonInfoProvider

class BasicInfoProvider: PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "BasicInfoProvider"
    override fun printInfo(person: Person) { // need of override keyword
        super.printInfo(person)
        println("Person Info: ${person.firstName} ${person.lastName}")
    }

    override fun getSessionId(): String {
        return "sessionId"
    }
}

fun main() {
    // val provider = AbstractBasicInfoProvider()
    val provider = BasicInfoProvider()
    provider.printInfo(Person("John","Doe"))
    checkType(provider)
}

fun checkType(infoProvider:PersonInfoProvider) {
    if (infoProvider is SessionInfoProvider){
        (infoProvider as SessionInfoProvider).getSessionId() // casting not needed if we use smart cast
        println("is a session info provider with session ${infoProvider.getSessionId()}")
    } else {
        println("not a session info provider")
    }
}