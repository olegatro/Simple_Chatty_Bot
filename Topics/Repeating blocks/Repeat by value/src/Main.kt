fun main() {
    val number = readln().toInt()
    var result: String = ""

    repeat(number) {
        result += number.toString()
    }

    println(result)
}