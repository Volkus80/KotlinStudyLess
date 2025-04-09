package ru.volkus.rate.less_2


fun main() {
    val pupilsQuantity = 4
    val firstsMark = 3.0
    val secondsMark = 4.0
    val thirdsMark = 3.0
    val fourthMark = 5.0
    val averageMark = (firstsMark + secondsMark + thirdsMark + fourthMark) / pupilsQuantity
    println("%.2f".format(averageMark))
}