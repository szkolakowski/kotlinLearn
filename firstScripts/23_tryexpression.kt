fun main() {
    val str = "4a" // String
    val num: Int
    try {
        num = Integer.parseInt(str)
        println("Parsing successful")
    } catch (e: NumberFormatException) {
        println("Exception activated")
    } finally {
        println("Try expression finished")
    }
}