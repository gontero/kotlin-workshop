
interface IdProvider{
    fun getId(): String
}


class Entity private constructor(val id: String){
    companion object Factory : IdProvider {
        override fun getId() = "123"
        // can be without name
        const val id = "id"
        fun create() = Entity("$id companion ${getId()}")
    }
}

fun main() {
    val entity = Entity.Factory.create()
    val entity2 = Entity.create()
    println(Entity.id)
    println(entity.id)
}