data class Person(val name: String,
                  val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("Ram", age = 32),
            Person("Ega", age = 29))

    val oldest = persons.maxBy { it.age ?: 0 }
    val younger = persons.minBy { it.age?:0 }
    println("The oldest is: $oldest")
    println("The younger is: $younger")
}

