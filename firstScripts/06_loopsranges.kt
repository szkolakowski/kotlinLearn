fun main() {
    val names = arrayOf("Jim", "John", "Jenny")

    for (name in names) {
        println(name)
    }

    for (i in 0..names.size - 1) {
        println(names[i])
    }

    for (i in 0 until names.size) {
        println(names[i])
    }

    for (i in names.size - 1 downTo 0) {
        println(names[i])
    }

    for (i in 0..names.size - 1 step 2) {
        println(names[i])
    }

    println(names.indices)

    for (values in names.indices) {
        println(names[values])
    }
}