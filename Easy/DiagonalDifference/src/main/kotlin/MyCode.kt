package main.kotlin

import kotlin.math.abs

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var firstSum = 0
    var secondSum = 0
    for (i in arr.indices){
        firstSum += arr[i][i]
        secondSum += arr[(arr.size-1)-i][i]
    }
    return abs(firstSum-secondSum)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
