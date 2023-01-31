fun main() {
    val a: Int = readln().toInt()
    val b: Int = readln().toInt()
    val c: Int = readln().toInt()
    val d: Int = readln().toInt()

    for (x: Int in 0..1000) {
        if (((a * x * x * x) + (b * x * x) + (c * x) + d) == 0) {
            println(x)
        }
    }
}