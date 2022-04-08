fun main() {
    val names = arrayOf("Jim", "John", "Jenny")
    println(names.indices)
    println(names.size)
    println(names[0])
    names[0] = "Jeremy"
    println(names[0][0])
    println(names[0].length)
    names.set(0, "James")
    println("number of elements: ${names.size}")
    println("first name: ${names[0]}")
    println("last name: ${names[names.size - 1]}")
}