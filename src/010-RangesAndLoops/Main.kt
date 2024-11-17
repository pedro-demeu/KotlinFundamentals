package `010-RangesAndLoops`

fun main(){

    // RANGES ..
    // 1..10
    // a..z

    // Loops

    // FOR
    for (number in 1..10) {
        // number is the iterator and 1..5 is the range
        print("$number\n")
    }

    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }

    // while
    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }

    // FIZZBUSS CHALLENGE
    for (number in 1..100) {
        println(
            when {
                number % 15 == 0 -> "fizzbuzz"
                number % 3 == 0 -> "fizz"
                number % 5 == 0 -> "buzz"
                else -> "$number"
            }
        )
    }
}