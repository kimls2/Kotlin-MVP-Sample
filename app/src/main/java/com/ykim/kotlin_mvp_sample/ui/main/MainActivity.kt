package com.ykim.kotlin_mvp_sample.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.ykim.kotlin_mvp_sample.R
import com.ykim.kotlin_mvp_sample.data.model.GalleryImage
import com.ykim.kotlin_mvp_sample.ui.main.list.MainAdapter
import com.ykim.kotlin_mvp_sample.util.getAppComponent
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainMvp.View {

    lateinit var component: MainComponent
    @Inject lateinit var mainPresenter: MainPresenter

    private var adapter: MainAdapter = MainAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        component = getAppComponent().mainComponent(MainModule())
        component.inject(this)
        setContentView(R.layout.activity_main)

        mainPresenter.onAttach(this)
        mainPresenter.loadImage()
        mainRv.layoutManager = GridLayoutManager(this, 2)
        mainRv.adapter = adapter

    }

    override fun showGalleryImage(items: MutableList<GalleryImage>) {
        adapter.addItems(items)
    }

    override fun showError(message: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun showLoading(show: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSystemService(name: String?): Any {
        when (name) {
            "component" -> return component
            else -> return super.getSystemService(name)
        }
    }
}
