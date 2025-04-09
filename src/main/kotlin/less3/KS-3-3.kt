package ru.volkus.rate.less3

/**
@Author Volkus
 */

fun main() {
    var baseMultiplier = 5

    var result = ""

    for (multiplier in 1..10) {
        result += "$baseMultiplier x $multiplier = ${baseMultiplier * multiplier}\n"
    }
    println(result)
}