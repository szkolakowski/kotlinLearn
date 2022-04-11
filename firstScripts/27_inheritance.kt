fun main() {
    val jeremy = Human()
    jeremy.think()
    val mayank = Alien()
    mayank.think()
}

open class Human {
    open val message = "Real thinking."
    fun think() {
        println(message)
    }
}

class Alien : Human() {
    override val message = "Virtual thinking."
}