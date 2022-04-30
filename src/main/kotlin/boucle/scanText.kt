fun scanText(question: String): String? {
    println(question)
    return readLine()
}

fun scanNombre(question: String): Int? {
    println(question)
    var rep = readLine()?.toIntOrNull()
    return rep ?: -1
}

fun scanUser() = UserBean(scanText("write your name")!!, scanNombre("write your grade")!!)


fun main() {

    println("you're ${scanText("What's your name ?")}")
    println("you're ${scanNombre("How Old Are You ?")}")


    var usr = scanUser()
    println(usr.getName() + usr.getNote())
}