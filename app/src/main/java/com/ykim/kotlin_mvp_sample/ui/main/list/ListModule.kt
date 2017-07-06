package com.ykim.kotlin_mvp_sample.ui.main.list

import com.ykim.kotlin_mvp_sample.data.DataManager
import com.ykim.kotlin_mvp_sample.ui.main.MainPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by ykim on 2017. 7. 6..
 */
@Module
class ListModule {
    @Provides fun provieMainPresenter(dataManager: DataManager): MainPresenter {
        return MainPresenter(dataManager)
    }
}