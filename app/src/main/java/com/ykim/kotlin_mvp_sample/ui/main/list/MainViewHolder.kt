package com.ykim.kotlin_mvp_sample.ui.main.list

import android.content.Context
import com.bumptech.glide.Glide
import com.ykim.kotlin_mvp_sample.R
import com.ykim.kotlin_mvp_sample.data.model.GalleryImage
import com.ykim.kotlin_mvp_sample.ui.base.BaseViewHolder
import kotlinx.android.synthetic.main.item_main.view.*

/**
 * Created by ykim on 2017. 7. 5..
 */
class MainViewHolder(context: Context) : BaseViewHolder<GalleryImage>(context) {
    override fun layoutResId(): Int = R.layout.item_main

    override fun bind(item: GalleryImage) {
        Glide.with(context).load(item.title).centerCrop().into(thumbnailIv)
    }
}