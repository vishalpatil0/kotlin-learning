fun main() {

}

open class Mobile {
    fun turnOn(){}
    fun turnOff(){}
    open fun display() {
        println("simple mobile phone display")
    }
}

class SMobile : Mobile() {
    fun getScreenInfo() {}
    override fun display() {
        super.display()
        println("Smart phone display")
    }
}