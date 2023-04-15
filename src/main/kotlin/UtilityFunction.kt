fun main() {
    val e:Employee = Employee(12,"dfdfdf")
    e.apply {
        age = 45
        name = "patil"
    }
    //setting value all at once

    e.let {
        println(it.name)
        println(it.name)
    }
}

class Employee() {
    var age:Int = 0
    var name:String = ""
    constructor(age:Int, name:String) : this() {
        this.age = age
        this.name = name
    }
}