package `005-StringFormat`
import java.util.Locale

fun main(){
    val username: String = "Pedro Demeu"
    val message = "Hello $username, \nyour product become!"

    println(message)

    val price = 50
    val quantity = 3
    println("Total price is ${price * quantity}") // 150
    val total = 19.99 * quantity
    println(String.format("The total is: %.2f", total))

    val message2 = """
        |Hello,
        |This is Kotlin!
        |Enjoy coding.
    """.trimMargin()
    println(message2)

    val number = 1234.56
    println(String.format(Locale.UK, "UK Format: %, .2f", number))
}