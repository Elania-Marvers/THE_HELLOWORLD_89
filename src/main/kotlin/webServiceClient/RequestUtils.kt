package webServiceClient

import WeatherBean
import com.google.gson.*
import okhttp3.*
import java.io.InputStreamReader


const val URL_API_WEATHER = "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=b80967f0a6bd10d23e44848547b26550&units=metric&lang=fr"

val client = OkHttpClient()
val gson = Gson()

class RequestUtils {

    companion object {

        fun loadWeather(city: String): WeatherBean {
            val json = sendGet(URL_API_WEATHER.format(city))
            return gson.fromJson(json, WeatherBean::class.java)
        }

        fun sendGet(url: String): String {
            val request = Request.Builder().url(url).build()
            return client.newCall(request).execute().use {
                if (!it.isSuccessful) {
                    throw Exception("Réponse du serveur incorrect :${it.code}")
                }
                it.body?.string() ?: ""
            }
        }

        fun loadWeatherOpti(city: String) = sendGetOpti(URL_API_WEATHER.format(city)).use { //it:Response
            var isr = InputStreamReader(it.body?.byteStream())
            gson.fromJson(isr, WeatherBean::class.java)
        }

        fun sendGetOpti(url: String): Response {
            val request = Request.Builder().url(url).build()
            val response = client.newCall(request).execute()
            return if (!response.isSuccessful) {
                response.close()
                throw Exception("Réponse du serveur incorrect : ${response.code}")
            } else {
                response
            }
        }
    }
}
