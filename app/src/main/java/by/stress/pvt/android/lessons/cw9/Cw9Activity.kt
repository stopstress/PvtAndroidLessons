package by.stress.pvt.android.lessons.cw9

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import by.stress.pvt.android.lessons.R

class Cw9Activity : AppCompatActivity() {

    private  val carRepository: CarRepository = provideCarRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cw9)
    }
}
