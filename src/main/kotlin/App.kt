

val popcorn = 5
val hotDog = 7
var customers = 10;

fun main(){
    println("hello World")
    println("I have ${customers} customers")
    sampleTypes()
    sampleList()
    sampleSet()
}


fun sampleTypes(): Unit{
    val d: Int
    d = 3

    val e: String = "Hello"
    println(d)
    println(e)
}


fun sampleList(): Unit {
    val readOnlyShapes: List<String> = listOf<String>("triangle", "square", "circle")
    val shapes: MutableList<String> = mutableListOf("triangle", "sqaure", "circle")
    println(shapes)
    println("The first item on the list is : ${readOnlyShapes[0]}")
}

fun sampleSet(): Unit {
    val readOnlyFruit: Set<String> = setOf("apple", "bannana", "cherry")
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry")

    println(readOnlyFruit)
}

fun sampleMap(): Unit{
    val readOnlyAccountBalances: Map<Int, Int> = mapOf(1 to 100, 2 to 100, 3 to 100)
    val accountbalances: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100 , 3 to 100)
}