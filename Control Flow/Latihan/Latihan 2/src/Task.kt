import kotlin.random.Random

fun main() {
    // TODO 1
    val range = 1 ..100

    // TODO 2
    for (i in range step 10) {
        var result = i * 10
        println("$i x 10 = $result")
    }
}