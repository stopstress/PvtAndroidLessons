package by.stress.pvt.android.lessons.cw8

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import by.stress.pvt.android.lessons.R
import by.stress.pvt.android.lessons.R.*
import kotlinx.android.synthetic.main.activity_cw8.*


class Cw8Activity : AppCompatActivity() {

//
//    companion object {
//        const val SHARED_PREFS_NAME = "jhdkfjshfdkjs"
//        const val TEXT_KEY = "jhdkfjshfdkjs"
//    }

    private lateinit var prefsManager: AppPrefManager
            private lateinit var  editText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cw8)

        prefsManager = AppPrefManager(this)

        editText = editText3

        editText.setText(prefsManager.getUserText())

    }

    override fun onStop() {
        super.onStop()


    }
}
