package `02`

fun main() {

    val num = 256

    if (num is Int) { // num이 Int형일 때
        print(num)
    } else if (num !is Int) { // num이 Int형이 아닐 때, !(num is Int) 와 동일
        print("Not a Int")
    }
}
