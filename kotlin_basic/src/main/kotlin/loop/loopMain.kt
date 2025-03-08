package loop

fun main(args: Array<String>) {

    for(i in 1..10)
        println(i)
    for(i in 2..9)
        for (k in 1 ..9)
            println("$i * $k = ${i * k}")
}