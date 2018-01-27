package androideduio.com.listsample.ui

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.AttributeSet
import android.view.View
import androideduio.com.listsample.R

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val usersFragmentListView = UsersFragmentListView.newInstance()
        val usersFragmentRecyclerView = UsersFragmentRecyclerView.newInstance()

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        //fragmentTransaction.add(R.id.activity_dashboard_frmFragment, usersFragmentListView).commit()
        fragmentTransaction.add(R.id.activity_dashboard_frmFragment, usersFragmentRecyclerView).commit()
    }

}
