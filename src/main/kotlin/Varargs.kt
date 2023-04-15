fun main() {
    show1(1,1,1,1,1,1)
}

fun show1(vararg data:Int) {
    data.forEach {
        println(it)
    }
}