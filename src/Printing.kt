import java.util.*

class outer(){
    inner class inner(){
        fun nalini(){
            print("nalni")
        }
    }
}
fun main(args: Array<String>){
    val outer=outer().inner()
    outer.nalini()
}




