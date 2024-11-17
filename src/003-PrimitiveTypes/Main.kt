package `003-PrimitiveTypes`

fun main() {
    println("003- Primitive Types")

    var mutableVariable: String = "Mutable text"
    val immutableVariable: Int = 42
    val inferredType = "Type inferred"
    val nullableVariable: String? = null

    lateinit var lateInitVariable: String
    lateInitVariable = "Initialized later"

    // Constant (const val) - can only be used at the top-level or inside objects
    // const val PI = 3.14 // Must be declared outside of main.

    // Lazy initialization
    val lazyValue: String by lazy {
        "Initialized on first access"
    }

    val intArray: IntArray = intArrayOf(1,2,3)
    val stringList: List<String> = listOf("A", "B", "C")
    var mutableList: MutableList<Int> = mutableListOf(1, 2, 3)

    // Destructuring
    val (x, y, z) = listOf(10, 20, 30)

    // Printing variables
    println("Mutable: $mutableVariable")
    println("Immutable: $immutableVariable")
    println("Inferred: $inferredType")
    println("Nullable: $nullableVariable")
    println("LateInit: $lateInitVariable")
    println("Lazy: $lazyValue")
    println("IntArray: ${intArray.joinToString()}")
    println("StringList: ${stringList.joinToString()}")
    println("MutableList: ${mutableList.joinToString()}")
    println("Destructured: $x, $y, $z")

    println("Type of 'text': ${mutableVariable::class.simpleName}")

    val intNumber = 42
    val doubleNumber = 42.0
    val floatNumber = 42.0f

    println(intNumber::class.simpleName)  // Int
    println(doubleNumber::class.simpleName) // Double
    println(floatNumber::class.simpleName) // Float
}