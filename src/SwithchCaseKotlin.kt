fun main(args: Array<String>) {
    val day = 1
    var dayString = ""
    when (day) {
        1 -> {
            dayString = "Sunday"
            println(dayString)
        }
        2 -> {
            dayString = "Monday"
            println(dayString)
        }
        3 -> {
            dayString = "Tuesday"
            println(dayString)
        }
        4 -> {
            dayString = "Wednesday"
            println(dayString)
        }
        5 -> {
            dayString = "Thursday"
            println(dayString)
        }
        6 -> {
            dayString = "Friday"
            println(dayString)
        }
        7 -> {
            dayString = "Saturday"
            println(dayString)
        }

        else -> println("Oops, Invalid Day! since given number is not in [1,7]")
    }

}
