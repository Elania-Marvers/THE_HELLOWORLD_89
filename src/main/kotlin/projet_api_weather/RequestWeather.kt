import com.google.gson.*
import okhttp3.*
import java.io.InputStreamReader

const val URL_API_WEATHER =
    "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/%s?unitGroup=metric&include=current&key=JJHBQHZD9Q2BAUA72US285ZHW&contentType=json"

val client = OkHttpClient()
val gson = Gson()
class RequestWeather {

    companion object {

        fun loadWeather(city: String) = sendGet(URL_API_WEATHER.format(city)).use {
            var isr = InputStreamReader(it.body?.byteStream())
            gson.fromJson(isr, MyWeatherBean::class.java)
        }

        fun sendGet(url: String): Response {
            val response = client.newCall(Request.Builder().url(url).build()).execute()
            return if (!response.isSuccessful) {
                response.close()
                throw Exception("Réponse du serveur incorrect : ${response.code}")
            } else response

        }


    }
}
