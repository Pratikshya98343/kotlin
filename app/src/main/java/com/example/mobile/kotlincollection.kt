package com.example.mobile

// LIST
fun displayList() {
    val numbers: List<String> = listOf("one", "two", "three", "four")

    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers[2]}")
    println("Fourth element: ${numbers[3]}")
    println("Index of element \"two\": ${numbers.indexOf("two")}")
}

// Mutable and immutable list
fun main() {
    // Immutable List
    val lst = listOf("one", "two", "three")
    println("Immutable list")
    for (i in lst.indices) {
        println(lst[i])
    }
    println()

    // Mutable List
    val mutableLst = mutableListOf("one", "two", "three")
    mutableLst.add("Four")
    println("Mutable list")
    for (i in mutableLst.indices) {
        println(mutableLst[i])
    }

    // Set
    set()

    // Map
    map()

    // Task: Dictionary example
    dictionaryApp()
}

// Set function
fun set() {
    val numbers = setOf(1, 2, 3, 4)
    for (element in numbers) {
        println(element)
    }

    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}")
}

// Map function
fun map() {
    val countriesCapitals = mapOf(
        "Nepal" to "Kathmandu",
        "China" to "Beijing",
        "India" to "New Delhi"
    )
    println("All keys: ${countriesCapitals.keys}")
    println("All values: ${countriesCapitals.values}")
    println("Capital of Nepal is: ${countriesCapitals["Nepal"]}")
}

// Dictionary app function
fun dictionaryApp() {
    // Create a dictionary using mapOf()
    val dictionary = mapOf(
        "apple" to "A fruit that is typically round, red, green, or yellow, with a crisp texture.",
        "banana" to "A long, curved fruit with a yellow skin and soft, sweet, white flesh inside.",
        "cherry" to "A small, round fruit that is typically red or black and has a pit.",
        "date" to "A sweet fruit from the date palm tree, often eaten dried.",
        "elderberry" to "A small, dark purple fruit that grows in clusters on the elder tree."
    )

    println("Enter a word to get its meaning (or type 'exit' to quit):")

    while (true) {
        val input = readLine()

        // Check if the user wants to exit
        if (input.equals("exit", ignoreCase = true)) {
            println("Exiting the dictionary app. Goodbye!")
            break
        }

        // Get the meaning of the word
        val meaning = dictionary[input?.toLowerCase()]

        if (meaning != null) {
            println("Meaning of '$input': $meaning")
        } else {
            println("Sorry, the word '$input' is not in the dictionary.")
        }
    }
}