package by.stress.pvt.android.lessons.cw11_2

sealed class Cw11State {

    // фактически это ENUM

    object Progress : Cw11State()

    class Data(val text: String) : Cw11State()

    class Error(val throwable: Throwable) : Cw11State()

}