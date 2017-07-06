package com.ykim.kotlin_mvp_sample.ui.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ykim.kotlin_mvp_sample.R
import com.ykim.kotlin_mvp_sample.data.model.GalleryImage
import com.ykim.kotlin_mvp_sample.ui.main.list.MainAdapter
import com.ykim.kotlin_mvp_sample.util.getComponent
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject

/**
 * Created by ykim on 2017. 7. 5..
 */
class MainFragment : Fragment(), MainMvp.View {

    @Inject lateinit var mainPresenter: MainPresenter
    private val mainAdapter = MainAdapter()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater!!.inflate(R.layout.fragment_main, container, false)
        activity.getComponent<MainComponent>().listComponent().inject(this)
        mainPresenter.onAttach(this)
        return root
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainRv.adapter = mainAdapter
        mainRv.layoutManager = GridLayoutManager(context, 2)
        mainPresenter.loadImage(0)
    }

    override fun onDestroyView() {
        mainPresenter.onDetach()
        super.onDestroyView()
    }

    override fun showLoading(show: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(message: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showGalleryImage(items: MutableList<GalleryImage>) {
        mainAdapter.addItems(items)
    }

    companion object {
        fun newInstance(): MainFragment = MainFragment()
    }
}