package by.stress.pvt.android.lessons.cw8

import android.content.Context
import android.content.SharedPreferences
import kotlin.coroutines.coroutineContext


private const val SHARED_PREFS_NAME = "kjkj"
private const val TEXT_KEY = "lkjlkjlk"
private var defValueText = "dddd"

class AppPrefManager(context: Context)  {

    private val sharedPrefs: SharedPreferences = context
        .getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE)


    fun SaveUserText(text: String) {
        sharedPrefs
            .edit()
            .putString(TEXT_KEY, text)
            .putString(TEXT_KEY, text)
            .apply()
    }

    fun getUserText(): String {
        //return sharedPrefs.getString(TEXT_KEY, "") ?: ""
        return sharedPrefs.getString(TEXT_KEY, defValueText) ?: defValueText
    }

}