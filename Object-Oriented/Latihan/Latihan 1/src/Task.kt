// TODO 1
class Cat(private val name: String) {
    private var sleep: Boolean = false
    fun setSleep(value: Boolean){
        sleep = value
    }
    fun getSleep(): Boolean = sleep

    fun toSleep() {
        if(sleep){
            println("Fungsi getter dipanggil")
            println("$name, sleep!")
        } else {
            println("Fungsi getter dipanggil")
            println("$name, let's play!")
            println("Fungsi setter dipanggil")
        }
    }
}

fun main() {

    // TODO 2
    val gippy = Cat("Gippy")

    gippy.toSleep()
    gippy.setSleep(true)
    gippy.toSleep()
}