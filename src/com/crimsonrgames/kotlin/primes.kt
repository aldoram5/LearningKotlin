package com.crimsonrgames.kotlin

fun main(args: Array<String>) {
    //helper starting sequence that filters out even numbers
    val possiblePrimes = generateSequence(3) { it + 2 }
    // Note 2 to possiblePrimes is a Pair like Pair(2,possiblePrimes)
    val primes = generateSequence (2 to possiblePrimes) {
        //get next prime number
        val prime = it.second.first()
        // return next element on the sequence by filtering all the numbers divisible by next prime
        prime to it.second.filter { it % prime != 0 } //also a Pair(prime, filteredSeq)
    }.map { it.first } //we return only the prime number

    println(primes.take(20).toList())
}