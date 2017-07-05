package com.ykim.kotlin_mvp_sample.ui.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.ykim.kotlin_mvp_sample.R
import com.ykim.kotlin_mvp_sample.data.model.GalleryImage
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasSupportFragmentInjector, MainMvpView {
    @Inject lateinit var mainPresenter: MainPresenter

    @Inject lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainRv.layoutManager = GridLayoutManager(this, 2)

    }

    override fun loadData(p0: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showLoading(p0: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showContent() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setData(p0: List<GalleryImage>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(p0: Throwable?, p1: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return dispatchingAndroidInjector
    }
}
