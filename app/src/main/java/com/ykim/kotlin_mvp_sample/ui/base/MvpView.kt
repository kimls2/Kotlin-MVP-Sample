package com.qualson.tubing.ui.base

/**
 * Created by ykim on 2017. 4. 18..
 */
interface MvpView {

    fun showError(message: String)

    fun showLoading(show: Boolean)
}