package ru.volkus.rate.less_1

const val TIME_CALC_UNIT_VALUE = 60
fun main() {
    val secondsInHourValue = TIME_CALC_UNIT_VALUE * TIME_CALC_UNIT_VALUE
    val secondsValue: Short = 6480

    val hours: Int = 6480 / secondsInHourValue
    val minutes: Int = (secondsValue - hours * secondsInHourValue) / TIME_CALC_UNIT_VALUE
    val seconds: Int = secondsValue - hours * secondsInHourValue - minutes * TIME_CALC_UNIT_VALUE

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}

