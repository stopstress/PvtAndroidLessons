package by.stress.pvt.android.lessons.cw11_2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import by.stress.pvt.android.lessons.R
import by.stress.pvt.android.lessons.cw11_2.ui.mainactivityvmtemp.MainActivityVmtempFragment

class MainActivityVMTemp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_vmtemp_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainActivityVmtempFragment.newInstance())
                .commitNow()
        }
    }

}
