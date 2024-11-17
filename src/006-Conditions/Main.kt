package `006-Conditions`

fun main(){
    val product = "iMac"

    if (product.length != 0) {
        println("Cannot pass")
    } else if (product.length == 1) {
        println("Char")
    } else {
        println("pass")
    }


    // WHEN
    // Use when when you have a conditional expression with multiple branches.
    val obj = "Hello"

    // also we can storage value returned in variable
    when (obj) {
        // Checks whether obj equals to "1"
        "1" -> println("One")
        // Checks whether obj equals to "Hello"
        "Hello" -> println("Greeting")
        // Default statement
        else -> println("Unknown")
    }
}