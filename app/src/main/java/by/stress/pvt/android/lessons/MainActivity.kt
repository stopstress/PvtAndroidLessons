package by.stress.pvt.android.lessons

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import by.stress.pvt.android.lessons.cw10.Cw10Activity
import by.stress.pvt.android.lessons.cw8.Cw8Activity2
import by.stress.pvt.android.lessons.cw9.Cw9Activity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        goToCurrentLesson()
    }

    fun goToCurrentLesson() {

            val intent = Intent(this, Cw9Activity::class.java).apply {}
            startActivity(intent)
    }
}
