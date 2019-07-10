package by.stress.pvt.android.lessons.cw11

import android.os.Handler

class Cw11Presenter: Cw11BasePresenter {

    private var text: String = ""

    private var view: Cw11View? = null

    override fun setView(view: Cw11View?) {
        this.view = view
    }

    override fun load() {

        if(text.isNotEmpty()) {
            view?.showData(text)
            return
        } else {

            view?.showProgress()
            Handler().postDelayed({
                text = "Loaded"
                view?.showData(text)
                view?.dismissProgress()
                //listener.onSucess(emptyList<>())
            }, 5000)
        }
    }

    override fun okButtonWasClicked() {
        // делаем логику
        text += "1"
        view?.showData(text)
    }
}

