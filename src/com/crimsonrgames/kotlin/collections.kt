package com.crimsonrgames.kotlin

fun main(args: Array<String>) {
    val listOfLists = listOf(
            (1..5).toList(),
            (11..15).toList(),
            (21..25).toList()
    )
    // we nest lambdas here and we can still use the it param with no issues
    println(listOfLists.map { it.map {  it * 5 } })
    // flatMap "flats" the collection while also applies the lambda passed in
    println(listOfLists.flatMap { it.map {  it * 5 } })

    val l = (1..100).toList()
    // use take to take first n elements
    println(l.take(5))
    // we can get the same result by using droplast
    println(l.dropLast(95))
    // we can use drop and remove elements from the beginning
    println(l.drop(95))
    // we can get the same result using takelast
    println(l.takeLast(5))
    val gen = generateSequence(5) { it + 2 }
    // take works with generators too
    println(gen.take(5).toList())
}