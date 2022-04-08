fun main() {
    println(getSum(2, 3, 5))
    val array = intArrayOf(1,2,3,4,5,6)
    println(getSum(*array)) // * is a spread operator
}

fun getSum(vararg numbers: Int): Int {
    // numbers // Array<Int>
    var sum = 0
    for (number: Int in numbers) sum += number
    return sum
}