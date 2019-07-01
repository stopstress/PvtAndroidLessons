package by.stress.pvt.android.lessons.cw8


import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.widget.FrameLayout
import by.stress.pvt.android.lessons.R
import kotlinx.android.synthetic.main.activity_cw8_part2.*

class Cw8Activity2 : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cw8_part2)


        val fragment1 = Cw8Fragment1()
        val fragment2 = Cw8Fragment2()
        val fragment3 = Cw8Fragment3()

        // меняем фрагменты // важно, чтобы supportFragmentManager и фрагмент были одной версии
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container1, fragment3)
        transaction.replace(R.id.container2, fragment1)
        transaction.commit()


        findViewById<FrameLayout>(R.id.container1).setOnClickListener { changeFragment() }
        //container1.setOnClickListener { changeFragment() }
        // не работает, т.к. реплэйс не умеет принимать на вход вью - ему нужен цифровой айдишник
    }

    private fun changeFragment() {

        val transaction = supportFragmentManager.beginTransaction()

        val fragment2 = Cw8Fragment2()
        transaction.replace(R.id.container1, fragment2)

        transaction.addToBackStack(null) // добавить в хистори
        transaction.commit()


    }
}
