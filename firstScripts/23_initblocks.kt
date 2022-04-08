fun main() {
    val car = Car("Toyota", "Yaris", 2005) // instantiation (creation of an object from class)
    car.specs()
}

class Car(company: String = "None", model: String = "None", year: Int = 2000) { // constructor with properties
    val company: String
    val model: String
    val year: Int

    init {
        if (company.isBlank()) this.company = "None"
        else this.company = company.trim()
        this.model = model.trim()
        if (year<1990) this.year = 2000
        else this.year = year
    }

    fun specs() {
        println("Car manufacturer: ${this.company}")
        println("Car model: ${this.model}")
        println("Car production year: ${this.year}")
    }
}