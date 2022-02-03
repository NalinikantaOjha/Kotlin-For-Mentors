import java.util.*

fun main(args:Array<String>){
    println(5)// A.Printing in kotlin

    //B. variable in kotlin are refers to memory location
    val a =5 //1. immutable variable
    var b =6 //2. mutable variable

    //C. Declaration of Array
    arrayOf(1,3,2)    //1.using library function "arrayOf"
    Array(5,{i->i+2})    //2.using array constructor "Array()"

    //D. In kotlin there is nothing like datatype everything is an object we can call member variable and objects
    /* In kotlin there are 5 type of in built datatype
    1. Number
    2. Boolean
    3. Character
    4. String // There are two types of String 1.escaped(need to use escaped character like /n
     , 2.raw String(Easy to declire new lines """ nalini
                                                   kanta """
    5. Array
    */

    //E. TypeCasting or Type conversion its possible by the helper function
    val int:Int=0
    val long:Long=int.toLong()

    //F. Operator
    /*
    There are 6 types operator
    1. arithmetic (+ , - , * , /)
    2. Relation operator (>=,==,<=,>,<)
    3. assignment operator (+=, -= , *= , /=)
    4. unary operator ( ++ , -- )
    */
    var unary=10
    print(++ unary)
    /*
    5. Bitwise operator (shl , shr)
    6. logical operator (&& , // , !)
     */

    //G. Input Taking
    val read=Scanner(System.`in`)
    val takInteger =read.nextInt()



}




