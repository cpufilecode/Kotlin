package `03`

fun main() {
    val name = "홍길동"
    val email = "hong@example.kr"

    add(name)
    add(name, email)
    defaultArgs()
    defaultArgs(200)
}

fun add(name: String, email: String = "default") {

}

fun defaultArgs(x: Int = 100, y: Int = 200) {
    println(x+y)
}