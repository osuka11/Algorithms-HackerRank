package main.kotlin

fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
fun compareTriplets(a:Array<Int>, b :Array<Int>): Array<Int>{
    var alicePoints = 0
    var bobPoints = 0
    for (i in a.indices){
        when{
            a[i] < b[i] -> bobPoints++
            a[i] > b[i] -> alicePoints++
        }
    }
    return arrayOf(alicePoints,bobPoints)

}