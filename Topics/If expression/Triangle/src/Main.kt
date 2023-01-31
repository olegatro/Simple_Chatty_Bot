fun main() {
    val a: Int = readln().toInt()
    val b: Int = readln().toInt()
    val c: Int = readln().toInt()

    val result: String =
        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a) && (a > 0 && b > 0 && c > 0)) "YES" else "NO"

    println(result)
}