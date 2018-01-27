package androideduio.com.listsample.ui


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView

import androideduio.com.listsample.R
import androideduio.com.listsample.adapter.RecyclerViewAdapter
import androideduio.com.listsample.model.StudentInfo
import androideduio.com.listsample.singleton.AppUtil

class UsersFragmentRecyclerView : Fragment() {


    lateinit var masterView: View
    private val recyclerView by lazy { masterView.findViewById(R.id.fragment_students_recyclerView) as RecyclerView }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        masterView = inflater.inflate(R.layout.fragment_students_recyclerview, container, false)


        val layoutManager = LinearLayoutManager(context)
        val itemDiveder = DividerItemDecoration(context, layoutManager.orientation)
        val adapter = RecyclerViewAdapter(AppUtil.getStudents() as ArrayList<StudentInfo>)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = layoutManager
        recyclerView.addItemDecoration(itemDiveder)
        return masterView
    }

    companion object {

        fun newInstance(): UsersFragmentRecyclerView {
            val fragment = UsersFragmentRecyclerView()
            return fragment
        }
    }

}
