package com.example.mobile

fun main(args: Array<String>) {
    println("Hello world")

    // Mutable
    // We can reassign values to mutable variables
    var age = 20
    age = 25

    // Immutable
    // We can't assign values to immutable variables
    val roll = 15
    // roll = 10 // This line is commented out because it will cause a compilation error

    var a: Boolean = true
    var b: Char = 'R'
    var c: Byte = 12
    var d: Short = -356
    var e: Int = 43543
    var f: Long = -51321354L
    var i: Float = 5.6451344F
    var h: Double = 7.32644564

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(i)
    println(h)

    var p: Double = 132.32
    var y: Int = p.toInt()
    var z: Byte = y.toByte()

    println(p)
    println(y)
    println(z)

    var str: String = "Hello world"
    var length: Int = str.length
    var isEqual: Boolean = str.equals("Hello world")
    var username: String = "softwarica "

    println(username.trim())
    println(str)
    println(length)
    println(str.isEmpty())
    println(str.lowercase())
    println(str.uppercase())
    println(isEqual)
    println(str +", How are you?");
}