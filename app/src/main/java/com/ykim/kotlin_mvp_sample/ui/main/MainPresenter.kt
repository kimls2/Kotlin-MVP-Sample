package com.ykim.kotlin_mvp_sample.ui.main

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter
import com.ykim.kotlin_mvp_sample.data.DataManager
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers

/**
 * Created by ykim on 2017. 7. 5..
 */
class MainPresenter(
     val dataManager: DataManager) : MvpBasePresenter<MainMvpView>() {

  private val compositeDisposable: CompositeDisposable = CompositeDisposable()

  fun loadImage() {
    compositeDisposable.add(dataManager.getGallery().subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribeBy(onNext = { view.setData(it) },
            onComplete = { view.showContent() },
            onError = { view.showError(it, false) })
    )

  }
}