fun main() {
    val boris = Human1("Boris")
    boris.introduce()
    val galvin = Human2("Galvin")
    galvin.introduce()
    val mahomet = Human3(20, "Mahomet")
    mahomet.introduce()
}

class Human1 constructor(n: String) { // primary constructor
    private val name: String = n

    fun introduce() {
        println("My name is $name.")
    }
}

class Human2(n: String? = null) { // secondary constructor
    private val name: String?

    init {
        name = n
    }

    fun introduce() {
        println("My name is $name.")
    }
}

class Human3() { // secondary constructor
    private var age: Int = 0
    private var name: String = ""

    constructor(age: Int, name: String) : this() {
        this.age = age
        this.name = name
    }

    fun introduce() {
        println("My name is $name. I am $age years old.")
    }
}