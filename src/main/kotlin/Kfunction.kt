

fun sum(x: Int, y:Int): Int{
    return x + y;
}

fun sumMore(x:Int, y:Int) = x + y;


//lambda functions



fun uppercaseString(string: String): String{
    return string.uppercase()
}



val makeUpperCase = {string: String -> string.uppercase()}


val numbers = listOf<Int>(1, -2, 3, -4, -6, 0)

val positiveNumbers = numbers.filter({x -> x > 0})

val negativeNumbers = numbers.filter { x-> x < 0 }



// return from a function


fun toSeconds(time: String): (Int) -> Int = when (time){
    "hour" -> {value -> value * 60 * 60}
    "minute" -> {value -> value * 60}
    "second" -> {value -> value}
    else -> {value -> value }
}




fun main(): Unit {
    println(sum(1, 2))

//    println({string: String -> string.uppercase()}("hello"))
//    println(makeUpperCase("greedy"))
//    println(positiveNumbers)
//    println(negativeNumbers)
    val timesInminutes = listOf<Int>(2, 10, 15, 1)
    val mins2secs = toSeconds("minute")
    val totalTimeInSeconds = timesInminutes.map(mins2secs).sum()
    println("total time in $totalTimeInSeconds secs")
}



