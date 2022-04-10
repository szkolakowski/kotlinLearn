import java.util.TreeMap

// we use java data type
fun main() {
    val firstMap = TreeMap<String, String>()
    firstMap["Finland"] = "Helsinki"
    firstMap["Georgia"] = "Tbilisi"

    for ((country, capital) in firstMap) {
        println("$country : $capital")
    }
}