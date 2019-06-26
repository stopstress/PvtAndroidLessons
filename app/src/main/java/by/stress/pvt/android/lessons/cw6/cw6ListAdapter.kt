package by.stress.pvt.android.lessons.cw6

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import by.stress.pvt.android.lessons.R

class cw6ListAdapter(
    private val items: List<News>,
    private val listener: ClickListener
) :
    RecyclerView.Adapter<cw6ListViewHolder>() {

    // вызывается редко
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cw6ListViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_cw6_item, parent, false)

        val holder = cw6ListViewHolder(view)

        holder.itemView.setOnClickListener {

            listener.onNewsItemClick(items[holder.adapterPosition])

        }


        //return cw6ListViewHolder(view)

        return holder
    }

    // вызывается для каждого элемента
    override fun onBindViewHolder(holder: cw6ListViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    interface ClickListener {
        fun onNewsItemClick(item: News)

    }
}