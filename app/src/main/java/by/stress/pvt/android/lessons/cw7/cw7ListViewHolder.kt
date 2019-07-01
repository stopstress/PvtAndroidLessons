package by.stress.pvt.android.lessons.cw7

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import by.stress.pvt.android.lessons.R
import kotlinx.android.synthetic.main.activity_cw7_item.view.*


class cw7ListViewHolder(view:View) : RecyclerView.ViewHolder(view) {
    //view = itemView
    private val imageView = itemView.findViewById<ImageView>(R.id.imageView2)
    private val textView = itemView.findViewById<TextView>(R.id.textView2)

    fun bind(item: News) {

        imageView.setImageResource(R.drawable.ic_launcher_background)
        textView.text = item.title

    }

}