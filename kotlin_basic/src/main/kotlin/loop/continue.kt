package loop


fun main(args: Array<String>){
    for(i in 2..10){
        if(i % 2 == 0){
            continue
        }
        for(j in 1..9){
            if(j%2 == 0)
                continue
            println("$i * $j = ${i * j}")
        }
    }

}