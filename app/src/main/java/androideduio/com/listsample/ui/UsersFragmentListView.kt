package androideduio.com.listsample.ui


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView

import androideduio.com.listsample.R
import androideduio.com.listsample.adapter.ListAdapter
import androideduio.com.listsample.model.StudentInfo
import androideduio.com.listsample.singleton.AppUtil


class UsersFragmentListView : Fragment() {

    lateinit var masterView: View
    private val listView: ListView by lazy { masterView.findViewById<ListView>(R.id.fragment_students_listView) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        masterView = inflater.inflate(R.layout.fragment_students_listview, container, false)
        val studentListAdapter = ListAdapter(AppUtil.getStudents() as ArrayList<StudentInfo>)
        listView.adapter = studentListAdapter
        return masterView
    }

    companion object {
        fun newInstance(): UsersFragmentListView {
            val fragment = UsersFragmentListView()
            return fragment
        }
    }

}
