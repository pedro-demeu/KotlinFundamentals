package `009-Collections`

fun main() {
    val readOnlyShapes = listOf("triangle", "square", "circle")
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    // Prevent Unwanted Modifications
    val shapesLocked: List<String> = shapes

    println(readOnlyShapes)
    // [triangle, square, circle]
    println(shapes)
    // [triangle, square, circle]
    println(shapesLocked)
    // [triangle, square, circle]


    // To access an item in a list
    println("The first item in the list is: ${readOnlyShapes[0]}")
    // Can use .first() and .last() to get respective first item and last item
    val numItemsInList = readOnlyShapes.count()
    println(numItemsInList)
    println("circle" in readOnlyShapes) // true

    // Can use .add and .remove


    // Sets
    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    println(readOnlyFruit)
    // [apple, banana, cherry]

    // Map
    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)
    // {apple=100, kiwi=190, orange=100}

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)
    // {apple=100, kiwi=190, orange=100}
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")

}
