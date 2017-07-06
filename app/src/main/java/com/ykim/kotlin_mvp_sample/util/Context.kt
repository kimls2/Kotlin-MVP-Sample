package com.ykim.kotlin_mvp_sample.util

import android.content.Context
import com.ykim.kotlin_mvp_sample.injection.AppComponent

val SERVICE_COMPONENT = "component"

fun <T> Context.getComponent(): T {
    @Suppress("UNCHECKED_CAST")
    return this.getSystemService(SERVICE_COMPONENT) as T
}

fun Context.getAppComponent(): AppComponent {
    return this.applicationContext.getSystemService(SERVICE_COMPONENT) as AppComponent
}
