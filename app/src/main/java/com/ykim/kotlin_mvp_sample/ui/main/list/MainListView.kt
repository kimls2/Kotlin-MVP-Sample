package com.ykim.kotlin_mvp_sample.ui.main.list

import android.content.Context
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import com.ykim.kotlin_mvp_sample.data.model.GalleryImage
import com.ykim.kotlin_mvp_sample.ui.main.MainComponent
import com.ykim.kotlin_mvp_sample.ui.main.MainMvp
import com.ykim.kotlin_mvp_sample.ui.main.MainPresenter
import com.ykim.kotlin_mvp_sample.util.getComponent
import javax.inject.Inject

/**
 * Created by ykim on 2017. 7. 6..
 */
class MainListView(context: Context, attrs: AttributeSet? = null, defStyle: Int = 0) : RecyclerView(context, attrs, defStyle), MainMvp.View {
    private val adapter = MainAdapter()

    @Inject lateinit var presenter: MainPresenter

    init {
        context.getComponent<MainComponent>().listComponent().inject(this)
        layoutManager = GridLayoutManager(context, 2)
        super.setAdapter(adapter)
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        presenter.onAttach(this)
        presenter.loadImage()
    }

    override fun onDetachedFromWindow() {
        presenter.onDetach()
        super.onDetachedFromWindow()
    }

    override fun showLoading(show: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(message: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showGalleryImage(items: MutableList<GalleryImage>) {
        adapter.addItems(items)
    }
}