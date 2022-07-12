import day4.gridChallenge
import day4.superDigit
import kotlin.test.Test
import kotlin.test.assertEquals

internal class Day4 {

    @Test
    fun `grid challenge test`(){

        val input = arrayOf(
            arrayOf("ebacd", "fghij", "olmkn", "trpqs", "xywuv"),
            arrayOf("abc", "lmp", "qrt"),
            arrayOf("mpxz", "abcd", "wlmf"),
            arrayOf("abc", "hjk", "mpq", "rtv")
        )

        val expectedOutput = arrayListOf("YES", "YES", "NO", "YES")
        val actualOutput = ArrayList<String>()

        input.forEach {
            actualOutput.add(gridChallenge(it))
        }

        assertEquals(expectedOutput, actualOutput)

    }

    @Test
    fun `super digit test`(){
        val nS = arrayOf("9875","148","123")
        val kS = arrayOf(4,3,3)
        val expectedOutput = arrayListOf(8,3,9)
        val output = ArrayList<Int>()
        for (i in nS.indices){
            output.add(
                superDigit(n = nS[i], k = kS[i])
            )
        }
        assertEquals(expectedOutput, output)
    }


}