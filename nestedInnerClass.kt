//en déclarant la classe inner je peux utiliser
//les attributs de la classe externe à 
//l'intérieur des classes internes
//mais l'appel change
class Outer {
    var bar:Int=12
       inner class Nested1 (var x:Int) {
       fun foo() =bar
       }
       class Nested2 {
           fun foo() = 2
       }
            }
   fun main()
   {
    /* je ne peux pas écrire 
    val demo = Outer.Nested1(5)
     demo.bar=3 
    println(demo.bar)
    car Nested1 est inner
    */
     val demo = Outer().Nested1(5)
     println(demo.foo())
     println(demo.x)
     var o =Outer()
     o.bar=17
     println(o.bar)
   }