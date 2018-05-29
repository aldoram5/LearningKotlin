package com.crimsonrgames.kotlin.oo


class Empty // this is valid

class Person{
    var name:String = ""//implicit getter and setter

    var age:Int = 0
        get() = field // we can define getters and setters
        set(value) { // we have the implicit field here as field
            field = value //this is the default implementation for both
        }
}

class Dog(name: String, age: Int, breed: String){ //constructor params
    var name:String = name // we just assign the vars without init block
    var age:Int = age
    var breed:String = breed

}

// the above way can be simplified to this
class Country(val name:String, var population:Int)

class Cat(val name: String, var age: Int){
    constructor(name: String):this(name,0){// we can have multiple constructors, this one is considered a secondary
                                                // constructor meanwhile the one at class declaration level is the primary one
        println("This cat has been constructed with default age $age")
    }
}

class AnotherCat(val name: String, var age: Int = 0 ) // like the other cat but with default parameters instead of another constructor


class Machine(val name: String, var version: Int =1){

    fun doMachineThing(){
        println("doing things that machine $name do")
    }

    fun greetUser(userName: String = "User") = println("Hello $userName! I'm $name, I hope I can be of assistance")

}

fun main(args: Array<String>) {

}