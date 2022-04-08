fun main() {
    var i = 0
    while (i < 5) {
        println(i++)
        //continue
        //println("I am not printed :)")
    }

    i = 0
    outer@ do {
        println(i++)
        //break@outer
    } while (i < 5)
}