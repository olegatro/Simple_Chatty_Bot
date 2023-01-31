fun main() {
    val number1: Int = readln().toInt()
    val number2: Int = readln().toInt()
    val number3: Int = readln().toInt()
    val number4: Int = readln().toInt()
    val number5: Int = readln().toInt()

    println(number5 in number1..number2 || number5 in number3..number4)
}