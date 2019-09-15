data class Person(val name: String,
                  val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("Alice",age = 25),
            Person("Bob", age = 34))

    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")
}

