package by.stress.pvt.android.lessons.cw5

import android.app.Application
import android.util.Log


// глобальный контекст, созддаётся при запуске приложения
// синглтон, который уже есть
// удобно для передачи контекста библиотекам
// это глобальный контекст
// если передавать активность - то возможны утечки памяти - лучше передавать глобальный

class App: Application() {

    companion object {
        @JvmStatic
        lateinit var instance: App
    }

    override fun onCreate() {
        super.onCreate()

        instance = this

        Log.e("AAA", "App.OnCreate")
    }
}