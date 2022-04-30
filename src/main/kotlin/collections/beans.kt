class RandomName {
    private val list = arrayListOf("Toto", "Tata", "Bob")
    private var old = ""

    fun add(name: String) = if (name.isNotBlank() && name !in list) list.add(name) else false
    fun next() = list.random()

    fun nextDiff(): String {
        var send = next()
        while (send == old) {
            send = next()
        }
        old = send
        return send
    }

    fun nextDiffV2() = list.filter { it != old }.random().also { old = it }
    fun next2() = Pair(nextDiffV2(), nextDiffV2())
}
