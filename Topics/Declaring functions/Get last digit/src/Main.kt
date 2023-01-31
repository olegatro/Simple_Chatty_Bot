fun getLastDigit(number: Int): Char {
    return number.toString().last()
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}