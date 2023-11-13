interface A{
    fun callMe():String{
        return "Bonjour A"
    }
}
interface B{
    fun callMe():String{
        return "Bonjour B"
    }
}
open class Child:A,B{
 override fun callMe():String
  {return callMeA()+"**"+callMeB()
  }
  fun callMeA()=super<A>.callMe()+"-AAAAAA"
  fun callMeB()=super<B>.callMe()+"-BBBBBBB"
}
class Child1: Child(){
    override fun callMe(): String {
        return super.callMeA()
    }
}
fun main(){
    var c1=Child()
    println(c1.callMe())
    println(c1.callMeA())
    println(c1.callMeB())
}
      

