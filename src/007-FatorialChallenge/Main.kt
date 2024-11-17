package `007-FatorialChallenge`

fun main(){
    // create a program that calculate the fatorial of number gived

    val n = readln().toInt()

    var result = 1
    for (i in 1..n) {
        result *= i
    }

    println("The fatorial of $n is $result")
    println("program end")
}