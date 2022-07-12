package day4

import kotlin.system.measureTimeMillis

fun main(){
    val digit = "4757362"
    println(otherSuperDigit(digit, 10000))
}

fun gridChallenge(grid: Array<String>) : String{
    var response = -1
    val items = ArrayList<String>()
    grid.forEach { row: String -> items.add(String(row.toCharArray().sortedArray())) }
    for (i in 0 until items[0].length){
        val builder = StringBuilder()
        for (j in 0 until items.size){
            builder.append(items[j][i])
        }
        val column = builder.toString()
        val sortedColumn = String(column.toCharArray().sortedArray())
        if(column != sortedColumn) {
            response = 0
            break
        }
    }
    return if(response < 0) "YES" else "NO"
}

fun superDigit(n: String, k: Int): Int {
    val builder = n.repeat(k)
    val chars = builder.toCharArray().sumOf { x -> x.digitToInt() }
    return if(chars < 10) chars else superDigit(chars.toString(), 1)
}

fun otherSuperDigit(n: String, k: Int): Int{
    val builder = n.repeat(k)
    var digits = builder.toLong()
    var sum = 0L

    while(digits != 0L){
        sum += digits % 10
        digits /= 10
    }
    val chars = sum.toInt()
    return if(chars < 10) chars else otherSuperDigit(chars.toString(), 1)
}