package by.stress.pvt.android.lessons.cw6

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
//import android.support.v7.widget.RecyclerView
import by.stress.pvt.android.lessons.R
//import kotlinx.android.synthetic.main.activity_cw6.*

//import kotlinx.android.synthetic.main.activity_cw6.*

class Cw6Activity : AppCompatActivity(), cw6ListAdapter.ClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cw6)

        val cw6_recycler = findViewById<RecyclerView>(R.id.cw6_recycler)

        //cw6_recycler.hasFixedSize()
        cw6_recycler.setHasFixedSize(true)
        cw6_recycler.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)
        cw6_recycler.isNestedScrollingEnabled = false // если внутри другого скролла

        // адаптор - связывает данные с ресайклером

        val items = listOf(
            News("1", "", "New 1 New 1 New 1 New 1 New 1 New 1 New 1 New 1 "),
            News("2", "", "New 2 New 1 New 1 New 1 New 1 New 1 New 1 New 1 "),
            News("3", "", "New 3 New 1 New 1 New 1 New 1 New 1 New 1 New 1 "),
            News("4", "", "New 4 New 1 New 1 New 1 New 1 New 1 New 1 New 1 "),
            News("5", "", "New 5 New 1 New 1 New 1 New 1 New 1 New 1 New 1 "),
            News("6", "", "New 6 New 1 New 1 New 1 New 1 New 1 New 1 New 1 "),
            News("7", "", "New 7 New 1 New 1 New 1 New 1 New 1 New 1 New 1 "),
            News("8", "", "New 8 New 1 New 1 New 1 New 1 New 1 New 1 New 1 "),
            News("9", "", "New 9 New 1 New 1 New 1 New 1 New 1 New 1 New 1 "),
            News("10", "", "New 10 New 1 New 1 New 1 New 1 New 1 New 1 New 1 "),
            News("11", "", "New 11 New 1 New 1 New 1 New 1 New 1 New 1 New 1 "),
            News("12", "", "New 12 New 1 New 1 New 1 New 1 New 1 New 1 New 1 "),
            News("13", "", "New 13 New 1 New 1 New 1 New 1 New 1 New 1 New 1 "),
            News("14", "", "New 14 New 1 New 1 New 1 New 1 New 1 New 1 New 1 "),
            News("15", "", "New 15 New 1 New 1 New 1 New 1 New 1 New 1 New 1 "),
            News("16", "", "New 16 New 1 New 1 New 1 New 1 New 1 New 1 New 1 "),
            News("17", "", "New 17 New 1 New 1 New 1 New 1 New 1 New 1 New 1 "),
            News("18", "", "New 18 New 1 New 1 New 1 New 1 New 1 New 1 New 1 "),
            News("19", "", "New 19 New 1 New 1 New 1 New 1 New 1 New 1 New 1 "),
            News("20", "", "New 20 New 1 New 1 New 1 New 1 New 1 New 1 New 1 "),
            News("21", "", "New 21 New 1 New 1 New 1 New 1 New 1 New 1 New 1 ")
        )


        cw6_recycler.adapter = cw6ListAdapter(items, this )




        // cw6_recycler.addItemDecoration() // отступы-линии...
            // внутрь NestedScrollView


    }

    override fun onNewsItemClick(item: News) {

        Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()

    }
}
