package `03`

fun main(args: Array<String>) {

}

fun normalVarargs(vararg counts: Int) {
    for (num in counts) {
        println("$num")
    }
    print("\n")
}