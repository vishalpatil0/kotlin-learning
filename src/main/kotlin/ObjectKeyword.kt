/**
 * In Kotlin, the object keyword is used to declare an object that has a single instance, also known as a singleton object. Here are the rules for object declaration in Kotlin:
 *
 * An object is declared using the object keyword, followed by its name.
 *
 * An object can extend a class or interface, just like a regular class.
 *
 * An object can have properties, methods, and init blocks, just like a class.
 *
 * An object cannot have a constructor with parameters. Instead, you can define an init block to initialize the object.
 *
 * An object is lazily initialized by default, meaning that it is not created until it is first accessed.
 *
 * An object can have companion objects, which are like static members of a class in Java.
 */

fun main() {
    print(A.num)
    A.setName("vishal")
    print(A.getName())

    //java anonymous class
    val objectA = object : Parent{
        val name:String = "vishal"
        override fun show() {
            println(name)
        }
    }
}

interface Parent {
    fun show()
}
object A {
    var num: Int  = 12;
    private lateinit var name : String;

    fun setName(name:String) {
        this.name = name
    }

    fun getName() : String{
        return name
    }
}
