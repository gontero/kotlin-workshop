import java.util.*

object SealedEntityFactory {
    fun create(type: EntityType) : SealedClass {
        val id = UUID.randomUUID().toString()
        return when(type) {
            EntityType.EASY -> SealedClass.Easy(id, type.getFormattedName())
            EntityType.MEDIUM -> SealedClass.Medium(id, type.getFormattedName())
            EntityType.HARD -> SealedClass.Hard(id, type.getFormattedName(), 1.2f)
            EntityType.HELP -> SealedClass.Helper
        }
    }
}


sealed class SealedClass {
    object Helper: SealedClass() {
        fun getName() = "Helper"
    }

    data class Easy(val id: String, val name: String ): SealedClass()
    data class Medium(val id: String, val name: String): SealedClass()
    data class Hard(val id: String, val name: String, val multiplier: Float): SealedClass()
}

fun main() {

    // val sealedClass = SealedClass() - error class is sealed

    val entity = SealedEntityFactory.create(EntityType.MEDIUM)
    println(entity)

    val msg = when(entity) {
        is SealedClass.Easy -> "easy class"
        is SealedClass.Medium -> "medium class"
        is SealedClass.Hard -> "hard class"
        SealedClass.Helper -> "helper class"
    }
    println(msg)
}