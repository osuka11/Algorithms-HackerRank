package main.kotlin

fun staircase(n: Int): Unit {
    val symbol: String = "#"
    for (i in 1 until n){
        for (j in 1 until n-i){
         print(" ")
        }
        print(symbol.repeat(i))
        println()
    }

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}