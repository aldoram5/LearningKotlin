package com.crimsonrgames.kotlin

fun main(args: Array<String>){
    val pow = {f:Int -> f*f}

    val notAsLambda = {f:(Int) -> Boolean  -> { n:Int -> !f.invoke(n)}}

    val l = (1..100).toList()

    println("Apply to a list of numbers from 1 to 100")
    println("Pow:")
    println(l.map(pow)) //lambda stored as val can be passed like this
    println("Filter out those numbers that aren't odd")
    println(l.filter(::odd)) // calling a fun as a fun instead of executing it
    println("Filter out those numbers that aren't divisible by 3")
    println(l.filter(::isDivisibleBy3)) // calling a fun as a fun instead of executing it
    println("Filter out those numbers that are divisible by 3")
    println(l.filter(notAsLambda(::isDivisibleBy3))) // "notAsLambda" is defined as a lambda expression
    println("Same as above, different declaration way")
    println(l.filter(not(::isDivisibleBy3))) // "not" is defined as a function
    println("Filter out those that aren't divisible by 5")
    println(l.filter { it % 5 == 0 }) // it implicit when lambda expression has only 1 param
    println("Same as above, different way using named param for the lambda")
    println(l.filter { x -> x % 5 == 0 })
}

fun not(f: (Int) -> Boolean): (Int) -> Boolean {
    return {n -> !f.invoke(n)}
}

fun odd(x: Int): Boolean = x % 2 == 1

fun isDivisibleBy3(x: Int) = x % 3 == 0 && x != 0