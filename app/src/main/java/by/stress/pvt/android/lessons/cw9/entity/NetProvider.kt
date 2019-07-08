package by.stress.pvt.android.lessons.cw9.entity

import by.stress.pvt.android.lessons.BuildConfig
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object NetProvider {

    private var api: Api? = null


    //
    fun provideGson(): Gson {
        val gson = GsonBuilder().create()
        return gson
    }

    //
    fun provideOkHttp(): OkHttpClient {

        val okhttpBuilder = OkHttpClient.Builder()

        if (BuildConfig.DEBUG) {
            val logging = HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BASIC
            okhttpBuilder.addInterceptor(logging)
        }

        // okhttpBuilder.connectTimeout(5, TimeUnit.SECONDS)

        val okhttpClient = okhttpBuilder.build()

        // APP - Api - Rerofit - okhttp - Interceptor
        // Interceptor - позволяет добавить что-то в запрос в последний момент

        return okhttpClient
    }

    //
    fun provideRetrofit(baseUrl: String,
                        okHttpClient: OkHttpClient,
                        gson: Gson) : Retrofit {
        val retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
        return retrofit
    }

    //
    fun provideApi(retrofit: Retrofit): Api {

        if (api == null) {
            api = retrofit.create<Api>(Api::class.java)
        }
        return api!!
    }
}