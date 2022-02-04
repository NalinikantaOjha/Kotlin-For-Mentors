import java.lang.RuntimeException
import java.util.*
import javax.naming.ldap.UnsolicitedNotification

fun main(args:Array<String>){
    println(5)
val a=Recursion(1)//Calling Recursive Function
    println(a)
 DefaultArgument("kanha")   //Calling DefaultArgument Function
NamedArgument(int = 5)//Calling Named Argument
    val fn:(Int,Int)->Int={in3,in2->in3+in2}
    HigherOrderFunction(5,6,fn)
    val abc:Int? =0


}
//Function
fun NonParametarized (){

}
fun Parameterzed(n:String="d"){

}
fun NonReturnType(n:String="d"):Unit{

}
fun ReturnType(n:String="d"):String{
    return n
}
//Recursion Function
 fun Recursion(int:Int):Int {
    var a = 0
    if (int == 5) {
      return int
    }
    return Recursion(int+1)
}
fun DefaultArgument(name:String="nalini",int:Int=0){
    println("${name+int}")

}
fun NamedArgument(name:String="nalini",int:Int=0){
    println("${name+int}")

}
//Lambda Function
val a:(Int ,Int)->Int={int2, int->int+int2}
val print2:(String)->Unit={s:String->println(s)}



val name:(String)->Unit={s-> println(s)}
fun HigherOrderFunction(int: Int,int2: Int,fn:(Int,Int)->Int):Unit{
    val result=fn(int,int2)
    println(result)
}
inline fun Inline(){
    println("nalini")
}
