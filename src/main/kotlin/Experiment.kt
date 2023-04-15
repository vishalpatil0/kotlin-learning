fun main() {
    calculatetime{
        loop(20000000000)
    }
}

fun calculatetime(fn: ()->Unit) {
    val before = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println((end-before)/1000)
}

fun loop(z:Long) {
    (1..z).forEach {}
}