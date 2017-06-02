package com.lkmoreira.kotlin.marvel.business.presenter.base

import com.lkmoreira.kotlin.marvel.business.listener.base.BaseListener
import com.lkmoreira.kotlin.marvel.business.view.base.BaseView
import org.androidannotations.annotations.EBean

/**
 * This is responsible
 * @author Lucas Moreira <lucasm.java@gmail.com>
 * @since 02/06/2017.
 */
interface BasePresenter<in V : BaseView> : BaseListener {

    fun attachView(view: V)

    fun detachView()
}