package by.stress.pvt.android.lessons.cw7

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import by.stress.pvt.android.lessons.R

class cw7ListAdapter(
    private val items: List<News>,
    private val listener: ClickListener
) :
    RecyclerView.Adapter<cw7ListViewHolder>() {

    // вызывается редко
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cw7ListViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_cw7_item, parent, false)

        val holder = cw7ListViewHolder(view)

        holder.itemView.setOnClickListener {

            listener.onNewsItemClick(items[holder.adapterPosition])

        }

        // notifyDataSetChanged() // перезагрузить список


        //return cw7ListViewHolder(view)

        return holder
    }

    // вызывается для каждого элемента
    override fun onBindViewHolder(holder: cw7ListViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    interface ClickListener {
        fun onNewsItemClick(item: News)

    }
}