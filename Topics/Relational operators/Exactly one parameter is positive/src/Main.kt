fun main() {
    val number1 = readln().toLong()
    val number2 = readln().toLong()
    val number3 = readln().toLong()

    println((number1 > 0 && number2 <= 0 && number3 <= 0) || (number1 <= 0 && number2 > 0 && number3 <= 0) || (number1 <= 0 && number2 <= 0 && number3 > 0))
}