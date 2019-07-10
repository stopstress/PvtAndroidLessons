package by.stress.pvt.android.lessons.cw11

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import by.stress.pvt.android.lessons.R

class Cw11Activity : AppCompatActivity(), Cw11View {

    override fun showProgress() {
        textView.text = "Loading..."
    }

    override fun dismissProgress() {
        // игнорируем, тк текст всё равно поменяется
    }


    private lateinit var vModel: Cw11BasePresenter
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cw11)


        vModel = Cw11Presenter()
        vModel.setView(this)

        textView = findViewById<TextView>(R.id.textView)

        textView.setOnClickListener{
            vModel.okButtonWasClicked()
        }

        vModel.load() // загрузили данные
    }


    override fun showData(text: String) {
        textView.text = text
    }
}
