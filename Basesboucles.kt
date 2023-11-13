fun main()
{
// While 
while (variable) {
    println("XXXX")
}

// Do While
do {
    println("XXXXX")
} while (variable) 

//for
val lst = listOf("sabir", "Kamil", "Sadqi");
//for pour parcourir les valeurs
for (elt in lst) {
    println("Elément : $name");
}

//for pour parcourir les valeurs par indice 
for (i in elt.indices) {
    println("Elément à la position $i est : ${lst[i]}")
}

//for pour parcourir les éléments indice et valeur
for ((index, value) in elt.withIndex()) {
    println("Elément à la position $i est : $value")
}

//for avec un compteur de 1 à 10
for (i in 1..10) {
    println("$i")
}
//for avec un compteur de 1 à 9
for(i in 1 until 10)
    println(i)
// de a à t (x-1)
for(i in 'a' until 'x')
    print(i)

//for de 1 à 10 pas -2
for (i in 10 downTo 1 step 2) {
    println("Index is :$i")
}

for (i in 10 downTo 1 step 2) {​​
        println("Index is :$i")
    }​​
    for(i in 'a' .. 'x')
    print(i)

    //var arr : IntArray = intArrayOf(1,2,3)
//les mots-clés  step  et  downTo  sont en réalité des fonctions dîtes "infix".
//Elle permet de créer un objet Pair (de la bibliothèque Kotlin), un tuple associant 2 valeurs.
}