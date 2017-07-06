package com.ykim.kotlin_mvp_sample

import android.app.Application
import com.ykim.kotlin_mvp_sample.injection.AppComponent
import com.ykim.kotlin_mvp_sample.injection.AppModule
import com.ykim.kotlin_mvp_sample.injection.DaggerAppComponent

/**
 * Created by ykim on 2017. 7. 5..
 */
class MyApp : Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder().appModule(AppModule()).build()
    }

    override fun getSystemService(name: String?): Any {
        when (name) {
            "component" -> return component
            else -> return super.getSystemService(name)
        }
    }
}