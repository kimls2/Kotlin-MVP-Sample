package com.ykim.kotlin_mvp_sample

import android.app.Activity
import android.app.Application
import com.ykim.kotlin_mvp_sample.di.AppInjector
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by ykim on 2017. 7. 5..
 */
class MyApp : Application(), HasActivityInjector {

  @Inject lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

  override fun onCreate() {
    super.onCreate()
    AppInjector.init(this)
  }


  override fun activityInjector(): AndroidInjector<Activity> {
    return dispatchingAndroidInjector
  }
}