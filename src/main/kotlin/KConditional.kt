fun main():Unit {
    sampleConditional()
    sampleWhenOp()
    sampleLoop()
}



fun sampleConditional(): Unit {

    val d: Int
    val check = true

    if(check){
        d = 1
    }else{
        d = 2
    }

    println(d)
}



fun sampleWhenOp(): Unit {
    val obj = "Hello"

    when(obj){
        "1" -> println("one")
        "Hello" -> println("Greeting")
        else -> println("Unkown")
    }



}


fun sampleLoop(): Unit {

    val cakes: List<String> = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes){
        println("Yummy , it is a $cake cake")
    }


    var cakesEaten = 0;

    while(cakesEaten < 3){
        println("Eat a cake")
        cakesEaten++
    }


    var minCakesEaten = 0
    var cakesBaked = 0

    while(minCakesEaten < 3){
        println("Eat more cake")
        minCakesEaten++
    }

    do{
        println("Bake a cake")
        cakesBaked++
    }while (cakesBaked < minCakesEaten)


}


fun simplefun(): Unit{

    var a = 1
    val s1 = "a is $a"
    a = 2

    val s2 = "${s1.replace("is", "was")}, but now is $a"



    val items: List<String> = listOf("apple", "banana", "kiwi")

}


fun maxOf(a: Int, b:Int): Int {
    if(a > b){
        return a
    }else{
        return b
    }
}


fun maxOfab(a: Int, b:Int)= if (a > b)a else b
