package com.ykim.kotlin_mvp_sample.ui.main

import com.ykim.kotlin_mvp_sample.data.DataManager
import com.ykim.kotlin_mvp_sample.ui.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by ykim on 2017. 7. 5..
 */
class MainPresenter
@Inject constructor(val dataManager: DataManager) : BasePresenter<MainMvpView>() {

    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

    fun loadImage() {
        compositeDisposable.add(dataManager.getGallery().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeBy(onNext = { view.setData(it) },
                        onComplete = { },
                        onError = { })
        )

    }
}