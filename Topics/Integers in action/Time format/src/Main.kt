const val DAY_IN_SECONDS = 24 * 60 * 60
const val HOUR_IN_SECONDS = 60 * 60
const val MINUTE_IN_SECONDS = 60

fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line

    val currentDaySeconds = totalSeconds % DAY_IN_SECONDS
    val hours = currentDaySeconds / HOUR_IN_SECONDS
    val minutes = (currentDaySeconds % HOUR_IN_SECONDS) / MINUTE_IN_SECONDS
    val seconds = currentDaySeconds - (hours * HOUR_IN_SECONDS) - (minutes * MINUTE_IN_SECONDS)

    println("$hours:$minutes:$seconds")
}