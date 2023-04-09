fun main() {
    var arr = arrayOf(1,2,3,4)  //implicit declaration
    var ar = arrayOf<String>("vishal","patil") //explicit declaration
    var array1 = emptyArray<Double>()   //empty array creation
    var array2 = arrayOfNulls<Int?>(0)  //array of nulls


    for(i in ar) {
        println(i)
    }

   // with index
    ok(ar)


    println(ar[0])
    println(ar.get(0))
    ar.set(0, "ok")
    ok(ar)
}

private fun ok(ar : Array<String>) {
    for((i,e) in ar.withIndex()) {
        println("$i --> $e")
    }
}