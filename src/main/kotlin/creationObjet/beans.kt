import java.util.*

class TownBean(val city: String, val cp: String) {
    var pays: String? = null
}
data class DataTownBean(val city: String, val cp: String) {
    var pays: String? = null
}

class PlaneBean(name: String) {
    var id = name.hashCode()
        private set

    var name = name
        set(value) {
            field = value
            id = field.hashCode()
        }
}

class UserBean(namz: String, grade: Int = 0) {
    private val name: String
    private val id: Int
    private var note: Int

    init {
        name = namz
        note = grade
        id = namz.hashCode()
    }

    fun getName(): String {
        return name
    }

    fun getId(): Int {
        return id
    }

    fun getNote(): Int {
        return note
    }

    fun setNote(note: Int) {
        this.note = note
    }
}

class CarBean(var marque: String, var model: String, var couleur: String)

class StudentBean(val nom: String) {
    var note = 0
}

class PrintRandomIntBean(val max: Int) {
    private val random = Random()

    init {
        println(random.nextInt(max))
        println(random.nextInt(max))
        println(random.nextInt(max))
    }

    constructor() : this(100) {
        println(random.nextInt(max))
    }
}

fun main() {
    val car = CarBean("Seat", "Leon", "Grise")
    println("${car.marque} ${car.model} ${car.couleur}")
    val student = StudentBean("Toto")
    student.note++
    println("${student.nom} : ${student.note}")

}


