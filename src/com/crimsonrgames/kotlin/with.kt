package com.crimsonrgames.kotlin

fun main(args: Array<String>) {

    val properties = System.getProperties()

    with(properties){

        println(propertyNames().toList())
        for (name in propertyNames().toList()){
            if (name is String){
                println(getProperty(name))
            }
        }
    }
}