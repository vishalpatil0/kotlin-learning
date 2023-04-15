fun main() {
    println(Cal.add(2,3))
}

class Cal {
    private var name:String = "vishal"
    companion object {
        @JvmStatic
        fun add(a : Int, b : Int) : Int {
            return a+b
        }
    }
}
