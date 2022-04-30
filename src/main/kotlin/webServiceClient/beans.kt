import com.google.gson.annotations.SerializedName

data class WeatherBean(
    var coord: CoordBean,
    var visibility: Int,
    var name: String,
    @SerializedName("main")
    var temperature: TempBean
)
data class CoordBean(var lat: Double, var lon: Double)

data class TempBean(var temp: Double, var temp_max: Double, var temp_min: Double)
