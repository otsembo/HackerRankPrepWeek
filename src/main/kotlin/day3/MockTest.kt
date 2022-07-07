package day3

fun main(){
    println("INDEX: "+palindromeIndex("baa"))
}

fun palindromeIndex(s: String): Int {
    // Write your code here
    var index = 0
    val n = s.length
    val mid = (n - 1) / 2

    while(index <= mid){
        val altIndex = (n - 1) - index
        if(index == altIndex) break

        val c1 = s[index]
        val c2 = s[altIndex]

        if( c1 != c2 ){
            val option1 = s.removeRange(startIndex = index, endIndex = index+1)
            return if(palindromeIndex(option1) == -1) index else altIndex
        }

        index++

    }
    return -1
}
