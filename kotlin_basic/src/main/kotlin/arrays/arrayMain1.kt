package arrays

fun main(args: Array<String>){
    val arr1 = arrayOf(1, 2, 3, 4, 5)

    for (i in arr1){
        println(i)
    }

    val oneToTen: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(oneToTen[0])
    //var oneToTen2  = IntArray(10)

    val x= arrayOf(1, 2, 3, 4)
    println(x.size)
    println("x.indicies" + x.indices)
}