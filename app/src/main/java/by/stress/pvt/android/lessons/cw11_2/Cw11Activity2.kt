package by.stress.pvt.android.lessons.cw11_2

import android.arch.lifecycle.Observer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import by.stress.pvt.android.lessons.R
import by.stress.pvt.android.lessons.cw11_2.Cw11ViewModel

class Cw11Activity2 : AppCompatActivity() {


    private lateinit var viewModel: Cw11ViewModel
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cw11)


        viewModel = Cw11ViewModel()
        //viewModel.setView(this)

        textView = findViewById<TextView>(R.id.textView)

        textView.setOnClickListener{
            viewModel.okButtonWasClicked()
        }

        viewModel.state.observe(this, Observer {
            when(it) {
                is Cw11State.Progress -> textView.text = "Loading..."
                is Cw11State.Data -> textView.text = it.text
                is Cw11State.Error -> textView.text = it.throwable.toString()
            }
        })
        viewModel.load() // загрузили данные
    }


    fun showData(text: String) {
        textView.text = text
    }


    fun showProgress() {
        textView.text = "Loading..."
    }

    fun dismissProgress() {
        // игнорируем, тк текст всё равно поменяется
    }

}
