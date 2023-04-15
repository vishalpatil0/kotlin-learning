fun main() {

    //sign of ? means it can also accept null value
    val name:String? = null

    if (name != null) {
        name.uppercase()  //checking for null
    }

    name?.uppercase()  //safe call operator: check whether it is null or not and if it is null then it doesn't call it

    println(name?.uppercase())

    name?.let {
        println(it) // here it points to name variable
    }

    //elvis operator
    var selectedValue = name ?: "NUll"   //if name is null then it take "NULL" by default
    println(selectedValue)
    selectedValue!!.uppercase()  //throw java.lang.NullPointerException if object is null 
}
