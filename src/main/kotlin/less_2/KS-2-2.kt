package ru.volkus.rate.less_2

fun main() {
    val employeesQuantity = 50
    val employeesSalary = 30_000
    val salaryOfPermanentStaff = employeesQuantity * employeesSalary
    println(salaryOfPermanentStaff)

    val internsQuantity = 30
    val internSalary = 20_000
    val salaryConsideringInterns = salaryOfPermanentStaff + internsQuantity * internSalary
    println(salaryConsideringInterns)

    val averageSalary = salaryConsideringInterns / (employeesQuantity + internsQuantity)
    println(averageSalary)

}