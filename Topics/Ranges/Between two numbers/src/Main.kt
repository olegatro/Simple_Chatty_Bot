fun main() {
    val number1: Int = readln().toInt()
    val number2: Int = readln().toInt()
    val number3: Int = readln().toInt()

    println(number1 in number2..number3)
}