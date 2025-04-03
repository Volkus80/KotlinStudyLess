package ru.volkus.rate.less_2

import kotlin.math.pow

/**
@Author Volkus
 */

fun main() {
    val depositSum = 70_000
    val interestRate = 16.7
    val depositTerm = 20

    val totalDepositSum = depositSum * (1 + interestRate/100).pow(depositTerm)

    println("%.3f".format(totalDepositSum))
}