import java.util.*

class outer(){
   //immutable


}
fun main(args: Array<String>){
   val map = mapOf<Int,Char>(1 to 'm',2 to 'k')
   val list= listOf(1,2,4,"sdfg")
   val set = setOf<Int>(1,2,1)
   for (index in 0 until map.size){
   }
   //mutable
   val mutableList = mutableListOf(1,2,1,"")
   val arrayList = arrayListOf(5,6,3,9,"")
   val hashMap1= hashMapOf<Int,Int>(1 to 3,5 to 6)
   val mutablelist= mutableMapOf<Int,Int>()
   val mutableset= mutableSetOf<Char>('c','d','e')
   val hashSet= hashSetOf<Int>(5,6,2,3,55)

   val  sc=Scanner(System.`in`)
   val N =sc.nextInt()
   val A=IntArray(N)
   for (i in 0 until N){
      A[i]=sc.nextInt()
   }
   val hashMap:MutableMap<Int,Int> = mutableMapOf()
   for (i in A.indices) {
      if (hashMap.containsKey(A[i])) {
         // int count =hashMap.get(A[i]);
         hashMap[A[i]] = hashMap[A[i]]!! + 1
      } else {
         hashMap[A[i]] = 1
      }
   }
   for ((key, value) in hashMap) {

      println(key)

   }
}





