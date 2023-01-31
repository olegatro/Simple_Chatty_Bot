const val D: Int = 2
const val C: Int = 3
const val B: Int = 4
const val A: Int = 5

fun main() {
    val n: Int = readln().toInt()

    var dCount: Int = 0;
    var cCount: Int = 0;
    var bCount: Int = 0;
    var aCount: Int = 0;

    repeat(n) {
        val grade = readln().toInt()

        if (grade == D) {
            dCount++
        }

        if (grade == C) {
            cCount++
        }

        if (grade == B) {
            bCount++
        }

        if (grade == A) {
            aCount++
        }
    }

    println("$dCount $cCount $bCount $aCount")
}