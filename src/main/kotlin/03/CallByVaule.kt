package `03`

fun main() {

}

fun callByValue(b: Boolean): Boolean {
    println("callByValue function")
    return b
}

val lambda: () -> Boolean = {
    println("lambda function")
    true
}