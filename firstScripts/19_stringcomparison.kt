fun main() {
    val str1 = "Koko"
    val str2 = "MoMo"

    if (str1.equals(str2)) println("String1 equals String2") // u can also use normal binary operator ==
    else println("String1 does not equal String2")

    if (str1.equals(str1)) println("String1 equals String1")
    else println("String1 does not equal String1")
}