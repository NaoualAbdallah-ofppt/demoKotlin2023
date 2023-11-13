val fct1={ x: Int ->x*2}
val fct2={ x: Int ->x*3}
inline fun fct(x:Int,  fct:(Int)->Int )=fct(x)
fun main()
{
println(fct(1, fct2) )
println(fct(1, fct1) )
}

