package com.ykim.kotlin_mvp_sample.ui.main

import com.qualson.tubing.ui.base.MvpView
import com.ykim.kotlin_mvp_sample.data.model.GalleryImage

/**
 * Created by ykim on 2017. 7. 5..
 */
interface MainMvpView : MvpView {
    fun setData(items: MutableList<GalleryImage>)
}