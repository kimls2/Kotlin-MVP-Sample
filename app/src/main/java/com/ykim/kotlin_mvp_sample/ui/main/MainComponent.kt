package com.ykim.kotlin_mvp_sample.ui.main

import com.ykim.kotlin_mvp_sample.ui.main.list.ListComponent
import dagger.Subcomponent

@Subcomponent(modules = arrayOf(MainModule::class))
interface MainComponent {
    fun listComponent(): ListComponent
}