package com.example.mobile

fun main(args: Array<String>) {
    var age = arrayOf(1, 2, 3)
    println(age.joinToString(", "))
    println("The first element of age is " + age[0])
    println("The second element of age is " + age[1])
    println("The third element of age is " + age[2])

    println(" **************************")

    var name = arrayOf("ram", "shyam", "Hari")
    name[1] = "Pratikshya"
    println("The first element of name is " + name[0])
    println("The second element of name is " + name[1])
    println("The third element of name is " + name[2])
    println(name.size)


    var age1 = ArrayList<Int>()
    age1.add(1)
    age1.add(1, 20)
    age1.add(5)

    // We can add value directly in array while initializing variables.
    var age2 = arrayListOf<Int>(1, 20, 5)

    var nameList = arrayListOf<String>("sandis", "ram", "shyam")
    nameList.add("hari")
    nameList.add(4, "Sita")

    nameList.remove("shyam")
    nameList.removeAt(0)

    println(nameList)

    var mixArrayList = arrayListOf<Any>("hello", 5, 2.0)
    println(mixArrayList[0])
    println(mixArrayList[1])
    println(mixArrayList[2])
}