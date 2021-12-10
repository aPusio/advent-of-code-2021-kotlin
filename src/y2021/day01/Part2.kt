package y2021.day02

import readInput
import java.util.*

fun main() {
    var inputValues = readInput("2021", "day1").map { it.toInt() }
    var counter = 0
    while(inputValues.size > 2){
        val firstSum = inputValues.take(3).sum()
        inputValues = inputValues.drop(1)
        val nextSum = inputValues.take(3).sum()
        if(nextSum>firstSum) {
            counter++;
        }
    }
    print(counter)
}