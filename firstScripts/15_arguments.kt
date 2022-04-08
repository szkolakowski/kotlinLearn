fun main() {
    val argument = "test"
    saySomething(argument,3)
}

fun saySomething(argument:String,reps:Int) {
    for (i in 0 until reps) println("Hello! I've been asked to say \"$argument\".")
} 