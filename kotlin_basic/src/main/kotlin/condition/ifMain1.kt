package condition

fun main(args : Array<String>) {
    val d = 1
    // if-expression
    println(
        if (d == 1)"하나"
        else if(d ==2) "둘"
        else if(d ==3) "셋"
        else if(d ==4) "넷"
        else if(d ==5) "다섯"
        else "많다"
    )
}