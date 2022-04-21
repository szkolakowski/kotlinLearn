// 1. every class needs a toString() method
// 2. override equals & hashCode
// we can implement them just by adding a data keyword

data class Laptop(val b: String? = null, val p: Int? = null) {
    private val brand: String? = b
    private val price: Int? = p

    //fun clone():Laptop{
    //    return Laptop(brand,price)
    //}
}

fun main() {
    val laptop1 = Laptop("Dell", 2000)
    val laptop2 = Laptop("Apple", 2500)
    val laptop3 = laptop1.copy()
    val laptop4 = laptop1.copy(p = 3000)
    println(laptop1 == laptop2)
    println(laptop1 == laptop3)
    println(laptop1)
    println(laptop2)
    println(laptop3)
}

