package `011-Classes`

class Customer (val id: Int, var email: String)

class Contact(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

class Employee (val name: String, var salary: Double)

fun main(){
    val customer = Customer(1, "someemail@gmail.com")
    val contact = Contact(554, "mary@gmail.com")
    val programmer = Employee("Pedro", 150.000)

    println(programmer)
    contact.printId()
    println(customer.id)
    println(customer.email)
}