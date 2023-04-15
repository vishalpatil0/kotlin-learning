/**
 * If there is no class name declaration level constructor and class contain init() and constructor() block then init block get executed first
 */

//empty class
class Empty{}

fun main() {
//    var perosn: Person = Person("vishal",23)
    var person1 = Person(23.4f)
    var people1 = People("vihsal")
}

class Person(name:String, age:Int) {
    var name:String = name
    var age:Int = age
    init {
        println("Created object name --> $name age--> $age")
    }
    init {
        println("Second initializer block")
    }
    constructor(name:String):this(name,23)

    constructor(percentage: Float):this("vishal",23) {
        println("constructor block")
    }
}

class People {
    var name:String = ""

    constructor(name:String)  {
        this.name = name
    }
}