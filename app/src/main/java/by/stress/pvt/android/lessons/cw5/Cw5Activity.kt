package by.stress.pvt.android.lessons.cw5

import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.LocalBroadcastManager
import by.stress.pvt.android.lessons.R
import by.stress.pvt.android.lessons.cw5.App.Companion.instance

class Cw5Activity : AppCompatActivity() {

    val intentFilter = IntentFilter()
    val receiver = Cw5MyReceiver()

    val localBM = LocalBroadcastManager.getInstance(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cw5)

        //localBM.registerReceiver()
        instance // обращение к глобальному контексту
    }


    override fun onStart() {
        super.onStart()

        intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)

        registerReceiver(receiver, intentFilter)

            // localBM.sendBroadcast(intentFilter)
    }


    override fun onStop() {
        super.onStop()

        unregisterReceiver(receiver)

        //localBM.unregisterReceiver()
    }
}
