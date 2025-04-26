package com.example.kotlinbootcamp

fun main(){
    val celciusDegree = 22
    val fahrenheit = calculateFahrenheit(degree = celciusDegree.toDouble())
    println("$celciusDegree celcius degree is equal to $fahrenheit fahrenheit degree")
    printPerimeter(longSide = 5, shortSide = 3)
    val number = 6
    val factorial = calculateFactorial(number)
    println("Factorial of $number : $factorial")
    calculateLetterCount("Aaa Bbb Ccc")
}

fun calculateFahrenheit(degree : Double) : Double {
    return (degree * 1.8) + 32
}

fun printPerimeter(longSide : Int, shortSide: Int){
    val perimeter = (longSide + shortSide) * 2
    println("Perimeter : $perimeter")
}

fun calculateFactorial(number: Int) : Int{
    var factorial = 1
    for (i in 1..number){
        factorial *= i
    }
    return factorial
}

fun calculateLetterCount(word : String){
    var count = 0
    for(letter in word){
        if(letter.lowercaseChar() == 'a'){
            count++
        }
    }
    println("Number of a(s) in word : $count")
}