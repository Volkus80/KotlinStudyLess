package ru.volkus.rate.less_2

fun main() {
    val startHour = 9
    val startMinute = 39
    val tripMinutes = 457

    val startInMinutes = startHour * 60 + startMinute
    val endInMinutes = startInMinutes + tripMinutes

    val additionalDays = endInMinutes / (24*60)

    val endMinutesWithoutDays = endInMinutes - (additionalDays * 24 * 60)

    val endHour = endMinutesWithoutDays / 60
    val endMinute = endMinutesWithoutDays - endHour * 60

    println("$endHour:$endMinute")
}