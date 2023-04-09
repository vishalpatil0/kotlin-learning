fun main() {
  val Mustang = Car("vishal", "patil", 12)
    println("Mustang name --> ${Mustang.name}")
    Mustang.drive()
}

class Car (var name: String, val type: String, val kmRan : Int) {
    fun drive() {
        println("Driving....")
    }

    fun stop(){
        println("Stopping........")
    }
}