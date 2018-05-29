package com.crimsonrgames.kotlin.oo

fun Machine.isAWasher() = name.toLowerCase().contentEquals("washer")

fun Dog.bark():String {
    if (breed.toLowerCase().contentEquals("rottweiler"))
        return "WOOF!!"
    return "Woof!"
}
