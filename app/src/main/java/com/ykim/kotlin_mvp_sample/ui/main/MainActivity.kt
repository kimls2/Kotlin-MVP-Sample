package com.ykim.kotlin_mvp_sample.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ykim.kotlin_mvp_sample.R.layout

class MainActivity : AppCompatActivity() {


//  @Inject lateinit var mainPresenter: MainPresenter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layout.activity_main)
  }

//  override fun supportFragmentInjector(): AndroidInjector<Fragment> {
//    return dispatchingAndroidInjector
//  }
}
