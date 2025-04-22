package basic

class FancyInfoProvider : BasicInfoProvider() {

    override val sessionIdPrefix: String
        get() = "Fancy Session"

    override val providerInfo: String
        get() = "Fancy Session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy info")
    }
}

fun main() {
    // val provider = AbstractBasicInfoProvider()
    val provider = FancyInfoProvider()
    // provider.sessionIdPrefix it is protected
    provider.printInfo(Person("John","Doe"))
}