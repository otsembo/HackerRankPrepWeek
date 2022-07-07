package day1

fun main(){
   println(findMedian(arrayOf(0, 1, 2, 4, 6, 5, 3)))
}

fun findMedian(arr: Array<Int>) : Int{
    arr.sort()
    val n = arr.size
    val isEven = ( n%2 == 0 )
    val mid = n/2
    return if(isEven) arr[mid] else (arr[mid] + arr[mid + 1]) / 2
}