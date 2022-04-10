fun main() {
    var name: String? = null // question mark allows to store null values
    println("My name is $name")
    if (name == null) println("Name has a null value")
    name = "Robert"
    if (name == null) println("Name has a null value")
    else println("Name has been changed to $name")
}