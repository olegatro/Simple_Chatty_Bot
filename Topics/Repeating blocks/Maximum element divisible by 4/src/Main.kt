fun main() {
    val n: Int = readln().toInt()
    var maxNumber: Int = 4


    repeat(n) {
        val number: Int = readln().toInt()

        if ((number % 4) == 0 && number > maxNumber) {
            maxNumber = number;
        }
    }

    println(maxNumber)
}