fun learnArray() {
    println("--- immutable list ---")
    val immutableList = arrayOf("Kotlin", "programing", "comic") // or listOf("Kotlin", "programing", "comic") immutable
    println(immutableList.size)
    println(immutableList[0])
    println(immutableList.get(0))

    for (interesting in immutableList) {
        println(interesting)
    }

    // functional
    immutableList.forEach { interesting -> // it -> is default parameter
        println(interesting)
    }

    immutableList.forEachIndexed{ index, s ->
        println("$index : $s")
    }

    println("--- mutable list ---")
    val mutableList = mutableListOf("a", "b", "c")
    mutableList.add("d")
    mutableList.removeAt(0)
    println(mutableList)
}

fun learnMap() {

    println("--- immutable map ---")
    val immutableMap = mapOf(1 to "a", 2 to "b", 3 to "c")
    println(immutableMap.size)
    println(immutableMap[1])
    println(immutableMap.get(1))

    for (value in immutableMap) {
        println(value)
    }

    // functional
    immutableMap.forEach { key, value -> // it -> is default parameter
        println("$key : $value")
    }

    println("--- mutable map ---")
    val mutableMap = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    mutableMap[4] = "d"
    mutableMap.put(5, "e")
    mutableMap.remove(1)
    println(mutableMap)

}

fun main() {
    learnArray()
    learnMap()
}