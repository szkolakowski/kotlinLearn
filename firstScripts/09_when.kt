fun main() {
    val isSunday = false
    for (time in 0..24) {
        val greeting = when {
            isSunday -> "It's sunday :)"
            time in 0..11 -> "Good morning!"
            time == 12 -> "Time for lunch!"
            else -> "Good day!"
        }
        println("${if (time in 0..9) "0$time" else time} - $greeting")
    }
}