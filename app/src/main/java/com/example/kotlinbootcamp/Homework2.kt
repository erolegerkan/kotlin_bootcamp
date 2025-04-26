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
    val totalInternalAngles = calculateInternalAngles(4)
    println("Total internal angles for shape with 4 sides : $totalInternalAngles")
    val workDays = 22
    val salary = calculateSalary(workDays)
    println("Total salary for $workDays work days : $salary")
    val gigabytes = 60
    val invoicePrice = calculateInvoice(gigabytes = gigabytes)
    println("Invoice price for $gigabytes : $invoicePrice")
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

fun calculateInternalAngles(sideNumber : Int) : Int{
    return (sideNumber - 2) * 180
}

fun calculateSalary(workDays : Int) : Int{
    var salary = 0
    if(workDays <= 20){
        salary = 8 * 10 * 20
    }else{
        salary = 8 * 10 * 20
        salary += 8 * 20 * (workDays - 20)
    }
    return salary
}

fun calculateInvoice(gigabytes : Int) : Int{
    if(gigabytes <= 50){
        return 100
    }else{
        return 100 + ((gigabytes - 50) * 4)
    }
}