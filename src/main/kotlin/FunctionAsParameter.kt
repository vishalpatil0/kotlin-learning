fun main() {
    val add1: (Int,Int) -> Int= ::addition
    show(add1)
}

fun show(add1: (Int,Int) -> Int) {
    println(add1(12,12))
}

fun addition(a:Int, b:Int) : Int {
    return a+b;
}