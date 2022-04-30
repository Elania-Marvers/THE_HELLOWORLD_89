import java.util.*

fun main() {
    var v1: String = "toto"
    println(v1.uppercase(Locale.getDefault()))
    //v1 = null // sauf si null.toString() ;)
    var v2: String? = "toto"
    println(v2?.uppercase(Locale.getDefault()))
    var v3: String? = null
    println(v3?.uppercase(Locale.getDefault()))
    println("Hello World")

    println(v1 + v2) // string
    if (v3 != null) {
        println(v3.uppercase(Locale.getDefault()))
    }


    println(min(1, 2, 3))
    println(min(1, 3, 2))
    println(min(3, 3, 3))


}


fun min(a: Int, b: Int, c: Int): Int = if (min(a, b) < min(b, c)) min(a, b) else min(b, c)
fun min(a: Int, b: Int): Int = if (a < b) a else b
fun pair(c: Int) = c % 2 != 1
fun myPrint(chaine: String) = print("#$chaine#")
fun getPrice(croissant: Int = 0, baguette: Int = 0, sandwitch: Int = 0) =
    croissant_price * croissant + bread_price * baguette + sandwitch_price * sandwitch

