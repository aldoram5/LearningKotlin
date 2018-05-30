package com.crimsonrgames.kotlin.oo

class UsingGenericTypes<T> {
    fun methodWithGeneric(someType:T){
        println(someType)
    }
}

fun <T>genericFunction(myParam:T){

}