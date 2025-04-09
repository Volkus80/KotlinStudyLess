package ru.volkus.rate.less_2

fun main() {
    val startHour = 9
    val startMinute = 39
    val tripMinutes = 457

    val minutesInHour = 60
    val hoursInDay = 24

    val startInMinutes = startHour * minutesInHour + startMinute
    val endInMinutes = startInMinutes + tripMinutes

    val additionalDays = endInMinutes / (hoursInDay * minutesInHour)

    val endMinutesWithoutDays = endInMinutes - (additionalDays * hoursInDay * minutesInHour)

    val endHour = endMinutesWithoutDays / minutesInHour
    val endMinute = endMinutesWithoutDays - endHour * minutesInHour

    println("$endHour:$endMinute")
}