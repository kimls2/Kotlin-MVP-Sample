package com.ykim.kotlin_mvp_sample.ui.main

import com.ykim.kotlin_mvp_sample.data.DataManager
import dagger.Module
import dagger.Provides

/**
 * Created by ykim on 2017. 7. 6..
 */
@Module
class MainModule {
    @Provides fun provieMainPresenter(dataManager: DataManager): MainPresenter {
        return MainPresenter(dataManager)
    }
}