package by.stress.pvt.android.lessons

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import by.stress.pvt.android.lessons.cw11_2.Cw11Activity2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        goToCurrentLesson()
    }

    fun goToCurrentLesson() {

            val intent = Intent(this, Cw11Activity2::class.java).apply {}
            startActivity(intent)
    }
}
