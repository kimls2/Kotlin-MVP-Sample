package com.ykim.kotlin_mvp_sample.injection

import com.ykim.kotlin_mvp_sample.ui.main.MainComponent
import com.ykim.kotlin_mvp_sample.ui.main.MainModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun mainComponent(mainModule: MainModule): MainComponent
}

