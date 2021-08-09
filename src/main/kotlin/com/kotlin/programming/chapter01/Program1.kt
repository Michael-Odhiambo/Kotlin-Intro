package com.kotlin.programming.chapter01

fun main( args : Array<String> ) {
    println( "Hellow World!!" )

    val student = Student( "Michael Odhiambo" )
    println( "Student name: ${student.name}" )
    val carManufacturer = CarManufacturer( "Mercedes" )
    println( "Car Manufacturer: ${carManufacturer.name} ")
}