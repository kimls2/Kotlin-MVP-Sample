package com.ykim.kotlin_mvp_sample.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.ykim.kotlin_mvp_sample.R
import com.ykim.kotlin_mvp_sample.ui.main.list.MainListView
import com.ykim.kotlin_mvp_sample.util.ActivityUtils
import com.ykim.kotlin_mvp_sample.util.getAppComponent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var component: MainComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        component = getAppComponent().mainComponent(MainModule())
        setContentView(R.layout.activity_main)

        val myView: View? = MainListView(this)
        if (myView != null) {
            container.removeAllViews()
            container.addView(myView)
        }
//        val listView = MainListView(this)
//        container.addView(listView)
//        findOrCreateViewFragment()
    }

    override fun getSystemService(name: String?): Any {
        when (name) {
            "component" -> return component
            else -> return super.getSystemService(name)
        }
    }

    private fun findOrCreateViewFragment(): MainFragment {
        var mainFrag: MainFragment?
        mainFrag = supportFragmentManager.findFragmentById(R.id.container) as MainFragment?
        if (mainFrag == null) {
            mainFrag = MainFragment.newInstance()
            ActivityUtils.replaceFragmentInActivity(supportFragmentManager, mainFrag,
                    R.id.container)
        }
        return mainFrag
    }
}
