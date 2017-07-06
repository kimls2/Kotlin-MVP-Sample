package com.ykim.kotlin_mvp_sample.ui.main.list

import android.content.Context
import com.ykim.kotlin_mvp_sample.data.model.GalleryImage
import com.ykim.kotlin_mvp_sample.ui.base.BaseListAdapter
import com.ykim.kotlin_mvp_sample.ui.base.BaseViewHolder

/**
 * Created by ykim on 2017. 7. 5..
 */
class MainAdapter() : BaseListAdapter<GalleryImage>() {
    override fun getListItemView(context: Context): BaseViewHolder<GalleryImage> {
        return MainViewHolder(context)
    }
}