package by.stress.pvt.android.lessons.cw9.entity

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET ("kiparo.ru/t/fake-api/car-service.php")
    fun getCarsByCoord(
        @Query("p1Lat") p1Lat: Double,
        @Query("p1Lon") p1Lon: Double,
        @Query("p2Lat") p2Lat: Double,
        @Query("p2Lon") p2Lon: Double
    ) : Call<CarResponce>
}
