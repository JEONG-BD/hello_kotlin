package condition

fun main(args : Array<String>) {
    val d = 4
    val result = when {
        d == 1 -> println("하나")
        d == 2 -> println("둘")
        d == 3 -> println("셋")
        else -> println("몰라")
    }

    val result1 = when {
        d == 1 -> 1
        d == 2 -> 2
        d == 3 -> 3
        else -> 4
    }
    println(result)
    println("result1 = ${result1}")

}