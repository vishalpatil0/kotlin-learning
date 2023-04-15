import kotlin.contracts.contract

fun main() {
    val name = Container<Int>(12)
    val age = Container<String>("vihal")
}

class Container<T>(var data: T) {
    fun setData1(data:T) {
        this.data = data
    }
    fun getData1():T{
        return data
    }
}