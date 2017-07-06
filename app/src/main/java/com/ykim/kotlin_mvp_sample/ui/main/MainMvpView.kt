package com.ykim.kotlin_mvp_sample.ui.main

import com.ykim.kotlin_mvp_sample.data.model.GalleryImage
import com.ykim.kotlin_mvp_sample.ui.base.BaseMvp

/**
 * Created by ykim on 2017. 7. 5..
 */
interface MainMvpView : BaseMvp.View {

    fun setData(items: MutableList<GalleryImage>)

}