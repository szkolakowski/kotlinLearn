fun main() {
    val user = User("Simon", 20) // instantiation (creation of an object from class)
    user.say()
    //println("Hello ${user.name}! You are ${user.age} years old :)")
}

class User(private val name: String = "User", private val age: Int = 100) { // constructor with properties
    fun say() {
        println("Hello $name! You are $age years old :)")
    }
}