package by.stress.pvt.android.lessons

import by.stress.pvt.android.lessons.cw9.entity.Api
import by.stress.pvt.android.lessons.cw9.entity.CarResponce
import retrofit2.Call

class MockApi : Api {
    override fun getCarsByCoord(p1Lat: Double, p1Lon: Double, p2Lat: Double, p2Lon: Double): Call<CarResponce> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}