package ru.volkus.rate.less3

/**
@Author Volkus
 */

fun main() {
    var moveNumber = 1
    var moveStart = "E2"
    var moveEnd = "E4"

    val format = "[%s-%s; %d]"

    println(format.format(moveStart, moveEnd, moveNumber))

    moveNumber++
    moveStart = "E7"
    moveEnd = "E5"

    println(format.format(moveStart, moveEnd, moveNumber))
}