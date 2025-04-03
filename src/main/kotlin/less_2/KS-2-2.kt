package ru.volkus.rate.less_2

fun main() {
    val salaryOfPermanentStaff = 50 * 30_000
    println(salaryOfPermanentStaff)

    val salaryConsideringInters = salaryOfPermanentStaff + 30 * 20_000
    println(salaryConsideringInters)

    val averageSalary = salaryConsideringInters / 80
    println(averageSalary)

}