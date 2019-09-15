fun main(args: Array<String>) {

    val obj1 = EmpName()
    obj1.empName = "Ega"
    obj1.msg = "I think, Kotlin is a better JAVA"
    println("Your name is ${obj1.empName}")
    println("Your message is ${obj1.msg} " + String(Character.toChars(0x1F60D)))

}
