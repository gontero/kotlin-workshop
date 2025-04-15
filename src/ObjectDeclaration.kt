object EntityFactory {
    fun create() = ObjectDeclarationEntity(id = "id", name = "name")
}

class ObjectDeclarationEntity(val id: String, val name: String) {
    override fun toString(): String {
        return "id:$id name:$name"
    }
}

fun main() {
    val entity = EntityFactory.create()
    println("$entity")
}