
import java.lang.Exception
import java.time.Month
import java.time.Year
import java.util.*


fun moisDe31Jours(mois: Int): Boolean {
    try {
        if (mois in 1..12) {
            return Month.of(mois).length(Year.isLeap(Calendar.getInstance().get(Calendar.YEAR).toLong())) == 31
        } else
            throw Exception("Invalid Date !")
    } catch (e: Exception) {
        e.printStackTrace()
        return false
    }
}