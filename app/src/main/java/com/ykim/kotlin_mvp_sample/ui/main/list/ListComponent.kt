package com.ykim.kotlin_mvp_sample.ui.main.list

import com.ykim.kotlin_mvp_sample.ui.main.MainFragment
import dagger.Subcomponent

/**
 * Created by ykim on 2017. 7. 6..
 */

@Subcomponent(modules = arrayOf(ListModule::class))
interface ListComponent {
    fun inject(mainFragment: MainFragment)

    fun inject(mainListView: MainListView)
}