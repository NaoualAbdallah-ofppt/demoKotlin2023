import kotlin.math.pow
/*
basically whenever you have a function literal with
exactly one parameter you don’t have to define the
parameter explicitly but you can just use it
Kotlin allows some functions to be called without
using the period and brackets. These are called infix
methods, and their use can result in code that looks
much more like a natural language.
Writing an infix function is a simple case of following three rules:

The function is either defined on a class or is an extension method for a class
The function takes exactly one parameter
The function is defined using the infix keyword
*/
fun main()
{
   val x = 10.add(20)
   val y = 10 add 20   //appel infix
    
   println(x) 
   println(y)
   val z=3.0 puissance 3.5
  println(z)
}
infix fun Int.add(b : Int) : Int = this + b

infix fun Double.puissance(y:Double):Double=this.pow(y)





