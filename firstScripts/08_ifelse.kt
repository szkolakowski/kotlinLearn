fun main() {
    var number = 100
    var counter = 0
    while (true){
        if(number<=1) break
        number/=2
        counter++
        if(number>1) continue
    }
    // if(i in 4..7) == (4..7).contains(i)
    // val prefix = if(counter !in 4..7) "-" else ">"
    println(counter)
}