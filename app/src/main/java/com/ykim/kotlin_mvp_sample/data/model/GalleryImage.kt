package com.ykim.kotlin_mvp_sample.data.model


/**
 * Created by ykim on 2017. 4. 11..
 */

data class GalleryImage(
        val id: String,
        val cover: String,
        val is_album: Boolean,
        var title: String,
        var description: String,
        val type: String,
        val width: Int,
        val height: Int,
        val size: Int,
        val section: String,
        val ups: Int,
        val downs: Int,
        val score: Int,
        var link: String,
        val gifv: String,
        val animated: Boolean,
        val cover_width: Int,
        val cover_height: Int)
{
    fun getUrl(): String {
        var thumbnailId = id
        if (is_album) {
            thumbnailId = cover
        }
        return BASE_IMAGE_ADDRESS + thumbnailId + MEDIUM_THUMBNAIL + ".jpg"
    }

    fun getAspectRation(): Float {
        val minAspectRatio = 0.7f
        if (is_album) {
            return Math.max(minAspectRatio, (cover_width / cover_height).toFloat())
        } else {
            return Math.max(minAspectRatio, (width / height).toFloat())
        }
    }


    companion object {
        private val BASE_IMAGE_ADDRESS = "http://i.imgur.com/"
        val MEDIUM_THUMBNAIL = 'm'

        fun getThumbnailSize(id: String?, is_album: Boolean, cover: String?): String {
            var thumbnailId = id
            if (is_album) {
                thumbnailId = cover
            }
            return BASE_IMAGE_ADDRESS + thumbnailId + MEDIUM_THUMBNAIL + ".jpg"
        }
    }
}