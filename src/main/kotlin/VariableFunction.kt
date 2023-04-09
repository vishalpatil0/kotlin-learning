fun main() {
//    var a = ::addition
     var a: (a: Int, b: Float) -> Float = ::addition
    addition(12, 12.4f)
}

fun addition(a : Int, b : Float) : Float {
    return a+b
}