fun main() {

    // TODO 2
    val user = User("John", 23, "St. Petersburg")

    // TODO 3
    val newUser = User("John", 25, "Saint Petersburg")

    // TODO 4
    println("""
        User
        Name: ${user.name}
        Age: ${user.age}
        Address: ${user.address}
    """.trimIndent())

    println("""
        
        New User
        Name: ${newUser.name}
        Age: ${newUser.age}
        Address: ${newUser.address}
    """.trimIndent())

}

// TODO 1
class User(val name: String, val age: Int, val address: String)