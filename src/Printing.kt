import java.util.*

fun main(args:Array<String>){
    val read=Scanner(System.`in`)
    // 1.If and else condition
     /* when we have two or more condition and we are not sure about it how what we
     will get in argument we can use If else condition
    */
    var a =read.nextInt()
    if (a==10){
        println(10)
    }else if (a==5){
        println(5)
    }else{
        print("nothing")
    }

    //2. When
    /*
    Its like if else condition  but in when we can put tow or more value and also we can set an range
     */
    when(a){
        1-> println(1)
        1-> println(10)
    }
    when(a){
        1,2,3-> println("between 1 to 3")
        4,5,6-> println("May be 4 or 5 or 6")
        else-> println("nothing")
    }
    when(a){
        in 1..10-> println("between 1 to 10")
    }


}




