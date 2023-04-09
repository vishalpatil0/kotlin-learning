fun main() {
    val gs:GS = GS()
    gs.age = 2
}

class GS{
    var age:Int = 0
        set(value) {
            if(age>18) {
                field = value
            } else {
                println("Age cannot be negative")
            }
        }
    lateinit var name:String
}