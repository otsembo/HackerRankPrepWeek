import day1.findMedian
import day1.timeConversion
import kotlin.test.Test
import kotlin.test.assertEquals

internal class Day1 {

    @Test
    fun `time conversion test`(){
        val inputTime = "07:05:45PM"
        val expectedOutput = "19:05:45"
        assertEquals(timeConversion(inputTime), expectedOutput)
    }

    @Test
    fun `mock exam test`(){
        val inputData = arrayOf(arrayOf(0,1,2,3,4,5,6), arrayOf(5,3,1,2,4))
        val expectedOut = arrayListOf(3,3)
        val actualOutput = ArrayList<Int>()
        inputData.forEach {
            actualOutput.add(findMedian(it))
        }
        assertEquals(expectedOut, actualOutput)
    }

}