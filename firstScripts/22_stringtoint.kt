fun main() {
    val str = "4" // String
    var num: Int = Integer.parseInt(str)
    num++
    println("type : ${num.javaClass.kotlin}\nvalue : $num")
}