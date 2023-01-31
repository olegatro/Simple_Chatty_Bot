import kotlin.math.*

fun main() {
    val (x1, y1) = readln().split(' ')
    val (x2, y2) = readln().split(' ')

    println(if ((x1 == x2) || (y1 == y2) || (abs(x1.toInt() - x2.toInt()) == abs(y1.toInt() - y2.toInt()))) "YES" else "NO")
}