abstract class Worker {
    abstract fun think()
    fun talk() {
        println("I am a worker.")
    }
}

class Doctor : Worker() {
    override fun think() {
        //TODO("Not yet implemented")
        println("Doctor Smith")
    }
}

fun main() {
    val brandon: Worker = Doctor()
    brandon.talk()
    brandon.think()
}