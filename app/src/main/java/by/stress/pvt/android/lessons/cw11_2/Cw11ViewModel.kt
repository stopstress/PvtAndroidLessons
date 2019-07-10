package by.stress.pvt.android.lessons.cw11_2

import android.arch.lifecycle.MutableLiveData
import android.os.Handler

class Cw11ViewModel {

    //var state: MutableLiveData<Cw11State> = MutableLiveData<Cw11State>()

    val state: MutableLiveData<Cw11State> by lazy(LazyThreadSafetyMode.NONE) {
        MutableLiveData<Cw11State>()
            // LazyThreadSafetyMode.NONE - быстрее грузит
    }

    fun load() {

        if (state.value is Cw11State.Data) return

        state.value = Cw11State.Progress

        Handler().postDelayed({
            state.value = Cw11State.Data("Loaded")
        }, 5000)
    }

    fun okButtonWasClicked() {
        // делаем логику
        if(state.value is Cw11State.Data) {
            val current = (state.value as Cw11State.Data).text
            state.value = Cw11State.Data(current + 1)
        }
    }
}
