fun main() {
    val lambda1 = { x: Int, y: Int -> x*y }
    show(lambda1)
    val multilineLambda = {
        x:Int, y:Int ->
        println("subtraction is happening here")
        x-y
    }
    show(multilineLambda)

    //single parameter lambda -> in single parameter lambda you don't have to declare the parameter "it" refer to that parameter
    val vishal: (Int) -> Int = {it+it}
    println(vishal(2))


}
