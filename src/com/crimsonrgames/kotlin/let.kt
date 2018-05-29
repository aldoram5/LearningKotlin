package com.crimsonrgames.kotlin

fun main(args: Array<String>) {
    // using let()

    //let() just needs a lambda as param

    // keep things under a scope
    (1..100).toList().let {
        println(it.filter { it % 5 > 3 })
    }

    // easy working with nullable types
    var mayBeNull:String? = ""
    mayBeNull?.let {
        if (mayBeNull.isEmpty() ){
            println("mayBeNull can no longer be null, but it's empty :P")
        }
    }
}