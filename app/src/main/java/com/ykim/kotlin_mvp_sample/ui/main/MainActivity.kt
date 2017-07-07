package com.ykim.kotlin_mvp_sample.ui.main

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.ykim.kotlin_mvp_sample.R
import com.ykim.kotlin_mvp_sample.ui.main.list.MainListView
import com.ykim.kotlin_mvp_sample.util.ActivityUtils
import com.ykim.kotlin_mvp_sample.util.getAppComponent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var component: MainComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        component = getAppComponent().mainComponent(MainModule())

        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        supportActionBar?.let {
            it.setHomeAsUpIndicator(R.drawable.ic_menu)
            it.setDisplayHomeAsUpEnabled(true)
        }

        setTitle(R.string.app_name)

        showView(R.id.action_schedule)

        nav_view.setNavigationItemSelectedListener(this)
        nav_view.setCheckedItem(R.id.action_schedule)

        feedback.setOnClickListener { Toast.makeText(this, "test", Toast.LENGTH_SHORT).show() }
    }

    override fun getSystemService(name: String?): Any {
        when (name) {
            "component" -> return component
            else -> return super.getSystemService(name)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        if (showView(item.itemId)) {
            drawer_layout.closeDrawers()
            return true
        } else {
            return false
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> {
                drawer_layout.openDrawer(GravityCompat.START)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showView(viewId: Int): Boolean {
        val view: View? = when (viewId) {
            R.id.action_schedule -> MainListView(0, this)
            R.id.action_speakers -> MainListView(1, this)
            R.id.action_location -> MainListView(2, this)
            R.id.action_info -> MainListView(3, this)
            else -> null
        }
        if (view != null) {
            content.removeAllViews()
            content.addView(view)
            return true
        }
        return false
    }

    private fun findOrCreateViewFragment(): MainFragment {
        var mainFrag: MainFragment?
        mainFrag = supportFragmentManager.findFragmentById(R.id.content) as MainFragment?
        if (mainFrag == null) {
            mainFrag = MainFragment.newInstance()
            ActivityUtils.replaceFragmentInActivity(supportFragmentManager, mainFrag,
                    R.id.content)
        }
        return mainFrag
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}
