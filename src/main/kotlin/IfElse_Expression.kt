fun main() {
    val x = 12
    val y = 13

    val result = if(x>y) {
        "x is greater"
    } else if(y>x) {
        "y is greater"
    } else {
        "both are equal"
    }
    println(result)
}