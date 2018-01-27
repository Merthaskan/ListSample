package androideduio.com.listsample.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import androideduio.com.listsample.R
import androideduio.com.listsample.model.StudentInfo
import kotlinx.android.synthetic.main.adapter_studentlist_item.view.*

/**
 * Created by merthaskan on 1/27/2018.
 */
class RecyclerViewAdapter(val students: ArrayList<StudentInfo>) : RecyclerView.Adapter<StudentsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): StudentsViewHolder {
        val contentView = LayoutInflater.from(parent!!.context).inflate(R.layout.adapter_studentlist_item, parent, false)
        return StudentsViewHolder(contentView)
    }

    override fun getItemCount(): Int = students.size

    override fun onBindViewHolder(holder: StudentsViewHolder?, position: Int) {
        val item = students[position]
        holder!!.txtNumber.text = item.studentNumber.toString()
        holder.txtName.text = item.studentName
        holder.txtUniversity.text = item.studentUniversity
    }

}