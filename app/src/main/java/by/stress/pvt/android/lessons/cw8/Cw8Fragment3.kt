package by.stress.pvt.android.lessons.cw8

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout

import by.stress.pvt.android.lessons.R
import kotlinx.android.synthetic.*

private const val ID_KEY = "ID_KEY"

class Cw8Fragment3 : Fragment() {



     companion object {


         fun getInstance(id: String) : Cw8Fragment3 {


         val fragment = Cw8Fragment3()

         val bundle = Bundle()

         bundle.putString(ID_KEY, id)

             fragment.arguments = bundle

             return fragment

         }
     }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val id = arguments?.getString(ID_KEY, "") ?: ""

        // таблет или телефон
        //val isTablet = if (findViewById<FrameLayout>(R.id.container1)) {}
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
        // (activity as Cw8Activity2). для обращения к методам активности - но лучше скрывать активность за интерфейсом
    }


    override fun onResume() {
        super.onResume()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    } // не всегда вызывается

    override fun onDestroyView() {
        super.onDestroyView()
    } // в паре с onCreate - и всегда вызывается



}
