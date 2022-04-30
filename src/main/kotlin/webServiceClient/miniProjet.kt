import webServiceClient.RequestUtils

fun main() {
    val weather = RequestUtils.loadWeather("Toulouse")
    println("Il fait ${weather.temperature.temp} ° à ${weather.name}")
/*    val res = RequestUtils.sendGet("https://www.google.fr")
    println("res=$res")*/
}