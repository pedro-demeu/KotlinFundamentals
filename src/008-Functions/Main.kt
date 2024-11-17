package `008-Functions`

fun main() {
    helloWorld()
    println(somar(10, 10))
}

fun helloWorld(): Unit {
    println("Hello world")
}

fun somar(a: Int, b: Int): Int {
    return (a + b)
}

// overload functions
//An overloaded function is a set of different functions that are callable with the same name.
// For any particular call, the compiler determines which overloaded function to use
// and resolves this at compile time.
// This is true for programming languages such as Java/Kotlin.

fun loginCheck(username: String, password: String, email: String) {
    println("Some memory space used to this fun")
}

fun loginCheck(username: String, password: String) {
    println("Other memory space used to this fun")
}

fun loginCheck(
    username: String,
    password: String,
    isAdmin: Boolean = false
) {
    println("Other memory space used to this fun")
}