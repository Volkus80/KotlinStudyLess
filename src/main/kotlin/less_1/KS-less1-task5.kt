package ru.volkus.rate.less_1

import java.text.Format

fun main() {
    val secondsValue: Short = 6480

    val hours: Int = 6480 / 3600
    val minutes: Int = (secondsValue - hours * 3600) / 60
    val seconds: Int = secondsValue - hours * 3600 - minutes * 60

    println("${String.format("%02d", hours)}:${String.format("%02d", minutes)}:${String.format("%02d", seconds)}")

}

