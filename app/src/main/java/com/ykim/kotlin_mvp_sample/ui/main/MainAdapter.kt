package com.ykim.kotlin_mvp_sample.ui.main

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.ykim.kotlin_mvp_sample.R
import com.ykim.kotlin_mvp_sample.data.model.GalleryImage

/**
 * Created by ykim on 2017. 7. 5..
 */
class MainAdapter : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    private var items: List<GalleryImage> = ArrayList()

    fun setData(itemsToAdd:List<GalleryImage>) {

    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MainViewHolder {
        val view: View = View.inflate(parent!!.context, R.layout.item_main, parent)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder?, position: Int) {
//        holder!!.thumbnailIv
    }

    inner class MainViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val thumbnailIv: ImageView = itemView!!.findViewById(R.id.thumbnailIv)
    }
}