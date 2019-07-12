package by.stress.pvt.android.lessons.cw12

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface StudentApi {

    @GET("data/student")

    fun getSudents(
        @Query("pageSize") pageSize: Int,
        @Query("offset") offset: Int
    ): Call<List<Student>>

}