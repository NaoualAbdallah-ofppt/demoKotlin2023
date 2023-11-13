class Personne(var num:Int,var nom:String)
{
init{this.nom=nom.uppercase()}
}
fun main ()
{
    val P=Personne(1,"sabir")
    println(P.nom)
}