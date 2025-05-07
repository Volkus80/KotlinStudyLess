package ru.volkus.rate.less3

/**
@Author Volkus
 */

fun main() {
    val data = "D2-D4;0"

    val (moveStart, moveEnd, moveNumber) = data.split("[-;]".toRegex())

    println(moveStart)
    println(moveEnd)
    println(moveNumber)
}