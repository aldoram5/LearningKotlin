package com.crimsonrgames.kotlin.oo

// data keyword automatically generates hashCode(), equals(), toString() and copy()
data class Address(val street: String, val number:Int, val postCode: String, val city: String)

fun main(args: Array<String>) {
    val addr1 = Address("street 1", 5,"77889", "SomeCity")
    val addr2 = Address("street 1", 5,"77889", "SomeCity")

    println("addr1 and addr2 contents are equal ? ${addr1.equals(addr2)}")//structural equality
    println("are they the 'same' object? ${addr1 === addr2}") // referential equality
    println("toString looks like this: $addr1")
    println(addr1.copy(street = "another street")) // copy let's you change values

    //data classes can be deconstructed
    val (street,number,postCode,city) = addr2


}