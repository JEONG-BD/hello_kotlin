package loop

import kotlin.random.Random


fun main(args: Array<String>){
    var count = 0
    var randomNum = Random.nextInt(0, 100)
    while(randomNum< 50){
        println("난수 $randomNum")
        randomNum = Random.nextInt(0, 100)
        count++
    }
    println("while 문 종료")
}