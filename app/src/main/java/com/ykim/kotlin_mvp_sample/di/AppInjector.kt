package com.ykim.kotlin_mvp_sample.di

import android.app.Activity
import android.app.Application
import android.os.Bundle
import com.ykim.kotlin_mvp_sample.MyApp
import dagger.android.AndroidInjection
import dagger.android.support.HasSupportFragmentInjector

/**
 * Helper class to automatically inject fragments if they implement [Injectable].
 */
object AppInjector {
  fun init(myApp: MyApp) {
    DaggerAppComponent.builder().application(myApp).build().inject(myApp)
    myApp.registerActivityLifecycleCallbacks(object : Application.ActivityLifecycleCallbacks {
      override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle) {
        handleActivity(activity)
      }

      override fun onActivityStarted(activity: Activity) {

      }

      override fun onActivityResumed(activity: Activity) {

      }

      override fun onActivityPaused(activity: Activity) {

      }

      override fun onActivityStopped(activity: Activity) {

      }

      override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {

      }

      override fun onActivityDestroyed(activity: Activity) {

      }
    })
  }

  private fun handleActivity(activity: Activity) {
    if (activity is HasSupportFragmentInjector) {
      AndroidInjection.inject(activity)
    }
//        if (activity is FragmentActivity) {
//            (activity as? FragmentActivity)?.supportFragmentManager?.registerFragmentLifecycleCallbacks(object : FragmentManager.FragmentLifecycleCallbacks() {
//                override fun onFragmentCreated(fm: FragmentManager?, f: Fragment?,
//                                               savedInstanceState: Bundle?) {
//                    if (f is Injectable) {
//                        AndroidSupportInjection.inject(f)
//                    }
//                }
//            }, true)
//        }

  }
}
