package com.ykim.kotlin_mvp_sample.ui.detail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ykim.kotlin_mvp_sample.R
import kotlinx.android.synthetic.main.activity_detail.*

/**
 * Created by ykim on 2017. 7. 6..
 */
class DetailActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val url = intent.getStringExtra(thumbnailUrl)
        Glide.with(this).asDrawable().load(url).apply(RequestOptions.centerCropTransform().placeholder(R.color.colorAccent)).into(bigThumbnail)
//        Glide.with(this).load(url).centerCrop().into(bigThumbnail)
    }

    companion object {
        private val thumbnailUrl = "thumbnailUrl"
        fun start(context: Context, thumbnailUrlFrom: String) {
            val starter = Intent(context, DetailActivity::class.java)
            starter.putExtra(thumbnailUrl, thumbnailUrlFrom)
            context.startActivity(starter)
        }
    }
}