package main.kotlin

fun birthdayCakeCandles(candles: Array<Int>): Int {
    candles.sort()
    return candles.count { it -> it == candles.last() }

}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}