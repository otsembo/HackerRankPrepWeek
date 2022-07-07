package day1

import java.text.DecimalFormat

// PLUS MINUS
fun plusMinus(arr: List<Int>) {
    // Write your code here
    var positive = 0.000000
    var negative = 0.000000
    var zero = 0.000000
    var nP = 0.0
    var nN = 0.0
    var nZ = 0.0
    val n = arr.size
    for (i in 0 until n) {
        val digit = arr[i]
        if (digit > 0) {
            nP += 1.0
        } else if (digit < 0) {
            nN += 1.0
        } else {
            nZ += 1.0
        }
    }
    positive += nP / n
    negative += nN / n
    zero += nZ / n
    val df = DecimalFormat("#.#####")
    println(df.format(positive))
    println(df.format(negative))
    println(df.format(zero))
}

// MIN MAX SUM
fun miniMaxSum(arr: Array<Int>): Unit {
    // Write your code here
    var min = Long.MAX_VALUE
    var max = Long.MIN_VALUE
    var sum = 0
    arr.forEach{
            num ->
        sum += num
        max = Math.max(max, num.toLong())
        min = Math.min(min, num.toLong())

    }
    print("${sum - max} ${sum - min}")

}

// TIME CONVERSION
fun timeConversion(s: String): String? {
    // Write your code here
    val times = s.split(":".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
    val h = 0
    val m = 1
    val ss = 2
    var timeAdd = 0
    val s1 = times[ss][0]
    val s2 = times[ss][1]
    val s3 = times[ss][2]
    timeAdd = if (s3 == 'P') 12 else 0
    var hh = times[h].toInt()
    if (hh != 12) hh += timeAdd
    var hour = ""
    hour = if (hh < 10) "0$hh" else "" + hh
    if (hh == 12 && s3 != 'P') hour = "00"
    val semi = ':'
    return hour + semi + times[m] + semi + s1 + s2
}



