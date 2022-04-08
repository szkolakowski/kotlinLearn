fun main() {
    val maxValue: Int = getMax(7, 19)
    println(maxValue)
}

fun getMax(n1: Int, n2: Int): Int {
    return if (n1 > n2) (n1) else (n2)
}

// ctrl alt L