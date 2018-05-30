package com.crimsonrgames.kotlin.oo


// classes must be declared as open since they're final by default
open class Base

class Inherited: Base()


// we have abstracts too those don't need the open access modifier
abstract class Shape(open val name:String){
     abstract fun area() : Double
}

open class Square(name:String = "Square", val sideSize:Double) : Shape(name){
    override fun area() :Double {
        return sideSize * sideSize
    }

}

//interfaces
interface Implementable {
    fun implementableMethod()
    fun implementedMethod() {
        println("default implementation interface")
    }
}

class Implements:Implementable {
    override fun implementableMethod() {
        println("implemented implementableMethod")
    }

}

open class SomeConflictingClass(){
    open fun implementedMethod() {
        println("I'm implemented")
    }
}

class FinalImplementation:SomeConflictingClass(), Implementable{

    override fun implementableMethod() {
        println("implementable has been implemented")
    }

    override fun implementedMethod() {
        super<Implementable>.implementedMethod() // we use super<ClassTocallSuperImplFrom> when we have conflicting method signatures
    }

    fun otherThing(){
        super<SomeConflictingClass>.implementedMethod() // we can always call conflicting signatures like this

    }

}

//we can't have open data classes
open class ValueHolder(open val myValue:Int)

// we can change val to var but not the other way around
class FinalValueHolder(override var myValue: Int): ValueHolder(myValue)