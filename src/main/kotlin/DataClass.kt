/**
 * Data classes are like normal classes with data keyword infront of them while declaration
 *     they have standard overridden toString and equals method (normaly equal method focus on hashcode but in case of data class it focus on
 *     data within the class.
 */
fun main() {
    val inf1 = Information("Vishal", 21)
    val inf2 = Information("Patil", 22)

    println(inf1)
    println(inf1 == inf2)

    //copy function
    val inf3 = inf1.copy(name = "Om")
    println(inf3)

    //if you want to store the properties value of class in variable
    val (name, age) = inf3
    println(name)
    println(age)
}

data class Information(var name: String, var age: Int) {

}