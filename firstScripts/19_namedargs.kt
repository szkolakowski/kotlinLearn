fun main() {
    greet("Hans")
    greet(reps = 7)
}

fun greet(name:String="User",reps:Int=1){
    for (i in 0 until reps) println("Hello $name!")
}

// ctrl alt L