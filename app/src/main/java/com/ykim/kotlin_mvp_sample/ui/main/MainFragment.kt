package com.ykim.kotlin_mvp_sample.ui.main

import com.hannesdorfmann.mosby3.mvp.viewstate.MvpViewStateFragment
import com.ykim.kotlin_mvp_sample.di.Injectable

/**
 * Created by ykim on 2017. 7. 5..
 */
class MainFragment : MvpViewStateFragment<MainMvpView, MainPresenter, MainViewState>(), Injectable {

//  @Inject lateinit var dataManager: DataManager


  override fun onNewViewStateInstance() {
    TODO(
        "not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun createViewState(): MainViewState {
    TODO(
        "not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun createPresenter(): MainPresenter {
   TODO()
  }
}