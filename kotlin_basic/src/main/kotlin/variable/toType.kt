package variable

fun main(args : Array<String>) {
    val l = 10.toLong()
    val s = l.toShort()
    val d = s.toDouble()
    val f = s.toFloat()
    val ss = f.toString()
    println("l = ${l}")
    println("s = ${s}")
    println("d = ${d}")
    println("f = ${f}")
    println("ss = ${ss}")
    
    val z = (-1).toLong()
    val k = z.toLong()
    println("z = ${z}")
    println("k = ${k}")
}