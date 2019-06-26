package by.stress.pvt.android.lessons

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import by.stress.pvt.android.lessons.cw2.Cw2Activity
import by.stress.pvt.android.lessons.cw4.Cw4Activity
import by.stress.pvt.android.lessons.cw5.Cw5Activity
import by.stress.pvt.android.lessons.cw6.Cw6Activity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        goToCurrentLesson()
    }

    fun goToCurrentLesson() {

            val intent = Intent(this, Cw6Activity::class.java).apply {}
            startActivity(intent)
    }
}
