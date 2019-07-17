fun main() {

    // TODO 2
    val text = formatText("Hi Sayang :")

    val lowerCase = text["lowerCase"]
    val upperCase = text["upperCase"]

    // TODO 3
    println(lowerCase)
    println(upperCase)

}

// TODO 1
fun formatText(text: String) = mapOf(
    "lowerCase" to text.toLowerCase(),
    "upperCase" to text.toUpperCase()
)