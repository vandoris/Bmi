package com.vandoris.bmi

class Hello {


}

fun main() {
    val p = Person("vandoris",65.5f, 1.7f)
    println(p.name + " bmi is : " + p.bmi())

    //BMI
    val weight = 65.5f
    val height = 1.7f
    val bmi = weight / (height * height)
    println("BMI : " + bmi)

    println("Hello Kotlin!")

    val c = 'A'
    println(c)
}