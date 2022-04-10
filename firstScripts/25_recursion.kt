import java.math.BigInteger

fun main() {
    val num = 36
    val power = 36
    val result = recursivePower(num, power)
    println(result)
}

fun recursivePower(base: Int, exponent: Int, iteration: Int = 0, result: BigInteger = BigInteger.ONE): BigInteger? {
    if (exponent < 0) return null
    if (iteration == exponent) return result
    return recursivePower(base, exponent, iteration + 1, result * base.toBigInteger())
} // BigInteger allows for no max value error
// the only error possible is StackOverflowError if not used properly
// it means you have no resources that script needs to work properly
// Biginteger("a") == a.toBigInteger()