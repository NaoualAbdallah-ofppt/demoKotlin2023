fun <T, R> Collection<T>.fold(
initial: R,
combine: (acc: R, nextElement: T) -> R
): R {
var accumulator: R = initial
for (element: T in this) {
accumulator = combine(accumulator, element)
}
return accumulator
}

//à chercher val et const val
/*
const val foo = "yy"
fun main()
{
   
    println(foo)
}
//class aa (var a:String)

fun main()
{
    const val foo = "yy" //ee
    println(foo)
}
*/