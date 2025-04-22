package basic

fun main() {
    // val provider = AbstractBasicInfoProvider()
    val provider = object : PersonInfoProvider {
        override val providerInfo: String
            get() = "new info provider"

        fun getSessionId() = "id"
    }
    provider.printInfo(Person("John","Doe"))
    provider.getSessionId()
}
