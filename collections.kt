// listOf
val lst = listOf("Sabir", "Radi", "Sadqi")
print (lst[0] )// => Sabir
lst[0] = "XX" // => ERROR ! List is immutable
for (elt in lst)
{
    println(elt)
}

// mutableListOf
val lstM = mutableListOf("Jake Wharton", "Joe Birch", "Robert Martin")
lstM[0] // => Jake Wharton
lstM[0] = "Mathieu Nebra" // => SUCCESS !

// setOf
val setOfNames = setOf("Jake Wharton", "Joe Birch", "Robert Martin")
listOfNames.first() // => Jake Wharton
listOfNames.add("Mathieu Nebra") // => ERROR ! Set is immutable

// mutableSetOf
val setOfNames = mutableSetOf("Jake Wharton", "Joe Birch", "Robert Martin")
listOfNames.first() // => Jake Wharton
listOfNames.add("Mathieu Nebra") // => SUCCESS !

//map
val listOfNames = mapOf(1 to "Jake Wharton",2 to "Joe Birch",3 to "Robert Martin")
listOfNames[0] // => Jake Wharton
listOfNames[0] = "Mathieu Nebra" // => ERROR ! List is immutable

// mutableMapOf
val listOfNames = mutableListOf("Jake Wharton", "Joe Birch", "Robert Martin")
listOfNames[0] // => Jake Wharton
listOfNames[0] = "Mathieu Nebra" // => SUCCESS !

fun main() {
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    println("All keys: ${numbersMap.keys}")
    println("All values: ${numbersMap.values}")
    if ("key2" in numbersMap) println("Value by key \"key2\": ${numbersMap["key2"]}")
    if (1 in numbersMap.values) println("The value 1 is in the map")
    if (numbersMap.containsValue(1)) println("The value 1 is in the map") // identique au précédent
    }

    fun main() {
        val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
        val anotherMap = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)
        println("The maps are equal: ${numbersMap == anotherMap}")
        }

        fun main() {
            val numbersMap = mutableMapOf("one" to 1, "two" to 2)
            numbersMap.put("three", 3)
            numbersMap["one"] = 11
            println(numbersMap)
            }