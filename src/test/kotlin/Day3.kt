import day3.palindromeIndex
import kotlin.test.Test
import kotlin.test.assertEquals

internal class Day3 {

    @Test
    fun `mock exam test`(){
        val queryOptions = arrayListOf("aaab", "baa", "aaa", "abxxbya")
        val querySolutions = arrayListOf(3,0,-1,5)

        val methodSolution = ArrayList<Int>()
        queryOptions.forEach {
            methodSolution.add(
                palindromeIndex(it)
            )
        }

        assertEquals(querySolutions, methodSolution)

    }

}