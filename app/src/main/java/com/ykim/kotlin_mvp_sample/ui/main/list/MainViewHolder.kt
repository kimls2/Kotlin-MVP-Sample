package com.ykim.kotlin_mvp_sample.ui.main.list

import android.content.Context
import com.ykim.kotlin_mvp_sample.R
import com.ykim.kotlin_mvp_sample.data.model.GalleryImage
import com.ykim.kotlin_mvp_sample.ui.base.BaseViewHolder
import com.ykim.kotlin_mvp_sample.ui.detail.DetailActivity
import com.ykim.kotlin_mvp_sample.util.GlideApp
import kotlinx.android.synthetic.main.item_main.view.*

/**
 * Created by ykim on 2017. 7. 5..
 */
class MainViewHolder(context: Context) : BaseViewHolder<GalleryImage>(context) {
    override fun layoutResId(): Int = R.layout.item_main

    override fun bind(item: GalleryImage) {
        thumbnailIv.setAspectRatio(item.getAspectRation())
        val url = GalleryImage.getThumbnailSize(item.id, item.is_album, item.cover)
//        Glide.with(context).load(item.getUrl()).centerCrop().into(thumbnailIv)
        GlideApp.with(this).asDrawable().load(item.getUrl()).fitCenter().placeholder(R.color.colorPrimary).into(thumbnailIv)
        this.setOnClickListener { DetailActivity.start(context, url) }
    }
}