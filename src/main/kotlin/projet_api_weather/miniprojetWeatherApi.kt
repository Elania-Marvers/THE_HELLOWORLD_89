fun main() {
    val weather = RequestWeather.loadWeather("Montpellier")
    println("Il fait ${weather.temperature.get(0).temp} ° à ${weather.address}")
}