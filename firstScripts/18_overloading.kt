fun main() {
    val minValueInt: Int = getMin(7, 19)
    println(minValueInt)
    val minValueDouble: Double = getMin(7.3, 3.4)
    println(minValueDouble)
}

fun getMin(n1: Int, n2: Int): Int = if (n1 > n2) (n1) else (n2)

fun getMin(n1: Double, n2: Double): Double = if (n1 > n2) (n1) else (n2)

// ctrl alt L