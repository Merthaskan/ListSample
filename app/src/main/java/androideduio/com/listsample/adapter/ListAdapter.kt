package androideduio.com.listsample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androideduio.com.listsample.R
import androideduio.com.listsample.model.StudentInfo

/**
 * Created by merthaskan on 1/27/2018.
 */
class ListAdapter(val studentList: ArrayList<StudentInfo>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val itemView = convertView
                ?: LayoutInflater.from(parent!!.context).inflate(R.layout.adapter_studentlist_item, parent, false)
        val txtNumber = itemView!!.findViewById<TextView>(R.id.adapter_studentlist_item_txtNumber)
        val txtName = itemView.findViewById<TextView>(R.id.adapter_studentlist_item_txtName)
        val txtUniversity = itemView.findViewById<TextView>(R.id.adapter_studentlist_item_txtUniversity)

        val item: StudentInfo = getItem(position)

        txtNumber.text = item.studentNumber.toString()
        txtName.text = item.studentName
        txtUniversity.text = item.studentUniversity


        return itemView

    }

    override fun getItem(position: Int): StudentInfo = studentList[position]

    override fun getItemId(position: Int): Long = 0

    override fun getCount(): Int = studentList.size

}