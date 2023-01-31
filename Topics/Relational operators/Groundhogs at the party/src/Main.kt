fun main() {
    val number = readln().toInt()
    val isWeekend = readln().toBoolean()

    println((isWeekend && (number >= 15 && number <= 25)) || (!isWeekend && (number >= 10 && number <=20)))
}