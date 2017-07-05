package com.ykim.kotlin_mvp_sample.ui.base

import com.qualson.tubing.ui.base.MvpView


/**
 * Created by ykim on 2017. 7. 5..
 */
interface Presenter<in V : MvpView> {
    fun attachView(view: V)
    fun detachView()
}