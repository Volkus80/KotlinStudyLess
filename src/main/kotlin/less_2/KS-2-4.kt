package ru.volkus.rate.less_2

/**
@Author Volkus
 */
fun main() {
    val buffPerCent = 20

    val cristalMineral = 7
    val ironMineral = 11

    val percents = 100

    val cristalBuffValue = cristalMineral * buffPerCent / percents
    val ironBuffValue = ironMineral * buffPerCent / percents


    println("cristal buff value = $cristalBuffValue")
    println("iron buff value = $ironBuffValue")
}