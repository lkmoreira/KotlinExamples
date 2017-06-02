package com.lkmoreira.kotlin.marvel.business.presenter.base

import com.lkmoreira.kotlin.marvel.business.view.base.BaseView
import org.androidannotations.annotations.EBean

/**
 * This is responsible
 * @author Lucas Moreira <lucasm.java@gmail.com>
 * @since 02/06/2017.
 */
@EBean
abstract class BasePresenterImpl<V : BaseView> : BasePresenter<V> {

    protected var view: V? = null

    override fun attachView(view: V) {
        this.view = view
    }

    override fun detachView() {
        view = null
    }
}