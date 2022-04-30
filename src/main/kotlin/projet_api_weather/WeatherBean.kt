import com.google.gson.annotations.SerializedName

data class MyWeatherBean(
    var coord: MyCoordBean,
    var visibility: Int,
    var address: String,
    @SerializedName("days")
    val temperature: List<MyTempBean>,
)
data class MyCoordBean(var latitude: Double, var longitude: Double)

data class MyTempBean(var tempmax: Double, var tempmin: Double, var temp: Double)
