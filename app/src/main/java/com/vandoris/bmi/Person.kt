package com.vandoris.bmi

class Person (val name:String, val weight:Float, val height:Float){

    fun bmi() : Float {
        val bmi = weight / (height * height)
        return bmi
    }
    fun hello() {
        println("Hello")
    }
}