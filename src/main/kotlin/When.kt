fun main() {
    val a = 12
    /*when(a) {
        1 -> println(1)
        2 -> println()
        3 -> println(3)
        14 -> println(12)
        else -> println("nothing")
    }*/

    // when as an expression
    var result = when(a) {
        1 -> "1"
        2 -> "2"
        3 -> "3"
        in 9..13 -> "12"
        else -> "nothing"
    }
    println(result)
}