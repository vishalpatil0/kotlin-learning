/**
 * In Kotlin, there are several ways to create arrays, including:
 *
 * Using the arrayOf() function: This function creates an array of objects with the specified values. For example, val numbers = arrayOf(1, 2, 3, 4, 5) creates an array of integers with the values 1, 2, 3, 4, and 5.
 *
 * Using the arrayOfNulls() function: This function creates an array of the specified size with null values. For example, val strings = arrayOfNulls<String>(5) creates an array of 5 strings with null values.
 *
 * Using the Array() constructor: This constructor creates an array of the specified size and initializes its values using a lambda expression. For example, val squares = Array(5) { i -> i * i } creates an array of 5 integers containing the squares of the numbers from 0 to 4.
 *
 * Using the IntArray(), DoubleArray(), and other similar functions: These functions create arrays of the specified type and size with default values. For example, val numbers = IntArray(5) creates an array of 5 integers with default values of 0.
 *
 * Using the toTypedArray() function: This function converts a collection to an array. For example, val list = listOf("a", "b", "c") and val array = list.toTypedArray() creates an array of strings containing the values "a", "b", and "c".
 *
 * Using range and step syntax to create arrays: This syntax can be used to create arrays with sequential or patterned values. For example, val evenNumbers = (2..10 step 2).toList().toTypedArray() creates an array of even numbers from 2 to 10.
 */
fun main() {
    var arr = arrayOf(1,2,3,4)  //implicit declaration
    var ar = arrayOf<String>("vishal","patil") //explicit declaration
    var array1 = emptyArray<Double>()   //empty array creation
    var array2 = arrayOfNulls<Int?>(0)  //array of nulls
    var array3 = IntArray(3) //array with size

    for(i in ar) {
        println(i)
    }

   // with index
    ok(ar)


    println(ar[0])
    println(ar.get(0))
    ar.set(0, "ok")
    ok(ar)
}

private fun ok(ar : Array<String>) {
    for((i,e) in ar.withIndex()) {
        println("$i --> $e")
    }
}