package androideduio.com.listsample.adapter

import android.view.View
import android.support.v7.widget.RecyclerView
import android.widget.TextView
import androideduio.com.listsample.R
import kotlinx.android.synthetic.main.adapter_studentlist_item.*

/**
 * Created by merthaskan on 1/27/2018.
 */
class StudentsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val txtNumber by lazy { itemView.findViewById(R.id.adapter_studentlist_item_txtNumber) as TextView }
    val txtName by lazy { itemView.findViewById(R.id.adapter_studentlist_item_txtName) as TextView }
    val txtUniversity by lazy { itemView.findViewById(R.id.adapter_studentlist_item_txtUniversity) as TextView }
}