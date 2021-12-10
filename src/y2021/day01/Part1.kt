package y2021.day01

import readInput

fun main() {
    val inputValues = readInput("2021", "day1").map { it.toInt() }
    var last = inputValues.first()
    val result = inputValues.drop(1)
        .map {
            val isBigger = it > last
            last = it
            isBigger
        }.count { it }
    print(result)
}