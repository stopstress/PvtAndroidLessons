package by.stress.pvt.android.lessons.cw11

interface Cw11BasePresenter {
    fun setView(view: Cw11View?)
    fun load()
    fun okButtonWasClicked()
}