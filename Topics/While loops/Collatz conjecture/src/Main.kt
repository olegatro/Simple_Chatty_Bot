fun main() {
    var n: Int = readln().toInt()
    var result: String = "$n"

    while (n != 1) {
        if (n % 2 == 0) {
            n /= 2
        } else {
            n = n * 3 + 1
        }

        result += " $n"
    }

    println(result)
}