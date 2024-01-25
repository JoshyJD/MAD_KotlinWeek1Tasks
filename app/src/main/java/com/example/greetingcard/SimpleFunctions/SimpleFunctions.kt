import java.util.*
import kotlin.math.*

// this a text that will print to console

fun one () {
    println("Function 1:")
    println("Hello World!")
}

// assigns and prints a value
fun two () {
    println("Function 2:")
    val i = 1
//    i = 2 error val can't be changed
    println("the value is $i")
}

fun three () {
    println("Function 3:")
    var x = 2
    var y = 5
    // the dollar sign is to interpolate/insert var and expressions
    println("The result of addition $x and $y is ${x+y}")
    x = -1
    println("The result of addition $x and $y is ${x+y}")

}

fun four () {
    println("Function 4:")
    val s = "Hello World"
    println(s.uppercase())
    println(s.reversed())

}

fun five () {

    println("Function 5:")
    var x = 2
    var y = 5
    val a = 6
    val b = 10

    if (!(x == y) || a == b && a > y) {
        println("print")
    }

    else
        println("no print")
}

fun palindrome(s: String) : Boolean {
    return (s == s.reversed()) }

fun seven (n: Double) {

    println("Function 7:")
    //radius needs to be a double
    val r = n;
    val volume : Double = 4.0/3.0 * Math.PI * Math.pow( r, 3.0)
    //decimal format
    println ("Volume of Sphere is: %.2f".format(volume))

}

fun eight () {

    println("Function 8:")

    val intArray = arrayOf<Int>(3, 2, 6 ,4)

    for (i in intArray) {
        println(i)
    }

    var strArray = arrayOf<String>("zero", "is the", "first" ,"Index")

    for (i in strArray) {
        println(i)
    }

    println(intArray.contentToString())
    println(strArray.contentToString())

}

fun nine () {

    println("Function 9:")

    var counter = 0

    while (counter != 3) {

        var string = "Ho "
        counter ++

        println(string)

    }
}

fun ten () {

    println("Function 10:")

    for (i in 1..42) {
        println(i)
    }

}

fun eleven () {

    println("Function 11:")

    for (i in 'a'..'z') {
        println(i)
    }

}

fun twelve()  {

    println("Function 12:")

    var myArray = arrayOf(3, 5, 2)
    var sum = 0

    for (i in myArray) {
        sum = sum + i
    }

    println(sum)
}


fun thirteen (arr : Array<Int>) {

    println("Function 13:")
//array input from user, placed into a changable list
    val list = mutableListOf<Int>()

    for (i in 0..arr.size-1) {
        list.add(arr[arr.size-1-i])
    }
//printing the list backwards
    println(list)
}

fun fourteen (a: Int) {

    println("Function 14:")
    when(a) {
        in 0..5 -> println("You're a young kid")
        in 13..17 -> println("You're a kid")
        18 -> println("You're 18")
        19,20 -> println("You're a young adult")
        in 21..65 -> println("You're a young kid")
        else -> println("You're old")
    }
}

fun fifteen (base : Int, exp : Int) : Int {

    println("Function 15:")
    var result = 1
//base times itself exp number of times
    for (i in 1..exp) {
        result *= base
        println(result)
    }

    println(result)
    return result

}

fun Int.sixteen(): Boolean {

    println("Function 16:")

    for (i in 2 until this - 1) {
        if (this % i == 0) {
            return false
        }
    }
    println("true")
    return true
}

public class Rectangle(
    val a: Double,
    val b: Double
) {
    init {
        println("Q17: Class Functionality")
        println("Rectangle create with a = $a and b = $b")
    }

    fun area() = a * b

    fun perimeter() = a + a + b + b

    fun isSquare() = a == b
}

fun main  () {

    one()
    two()
    three()
    four()
    five()
    palindrome ("madam")
    seven(5.2)
    eight()
    nine()
    ten()
    eleven()
    twelve()
    thirteen(arrayOf(1, 2, 3, 4, 5))
    fourteen(2)
    fifteen(2,3)
    13.sixteen()

    val myRect = Rectangle(4.0, 7.0)
    println(myRect.area())
    println(myRect.perimeter())
    println(myRect.isSquare())

}