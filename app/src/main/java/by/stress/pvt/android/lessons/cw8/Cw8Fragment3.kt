package by.stress.pvt.android.lessons.cw8

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import by.stress.pvt.android.lessons.R

class Cw8Fragment3 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // здесь не используется
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cw8_3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // здесь можно вызывать переменные активности - НЕ НАДО в onCreateView( -
        // только после инициализации интерфейса это надо делать
        // view.findViewById<>()
    }


}
