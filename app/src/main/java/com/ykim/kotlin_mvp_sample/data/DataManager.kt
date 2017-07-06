package com.ykim.kotlin_mvp_sample.data

import com.ykim.kotlin_mvp_sample.data.model.GalleryImage
import com.ykim.kotlin_mvp_sample.data.remote.ImgurService
import io.reactivex.Observable
import org.apache.commons.collections4.CollectionUtils
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by ykim on 2017. 7. 3..
 */
@Singleton class DataManager @Inject constructor(private val imgurService: ImgurService) {

    fun getGallery(page: Int): Observable<MutableList<GalleryImage>> {
        return imgurService.getGallery(page)
                .filter({ (success, _, data) -> success && CollectionUtils.isNotEmpty(data) })
                .map { it.data }
    }
}