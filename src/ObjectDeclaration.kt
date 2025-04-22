import java.util.UUID


enum class EntityType {
    EASY, MEDIUM, HARD;

    fun getFormattedName(): String {
        return name.lowercase().replaceFirstChar { it.uppercaseChar() }
    }
}

object EntityFactory {
    fun create(type: EntityType) : ObjectDeclarationEntity {
        val id = UUID.randomUUID().toString()
        val name = when(type) {
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> "hard"
        }
        return ObjectDeclarationEntity(id, name)
    }
}

class ObjectDeclarationEntity(val id: String, val name: String) {
    override fun toString(): String {
        return "id:$id name:$name"
    }
}

fun main() {
    val entity = EntityFactory.create(EntityType.EASY)
    println("$entity")

    val medium = EntityFactory.create(EntityType.MEDIUM)
    println("$medium")
}
