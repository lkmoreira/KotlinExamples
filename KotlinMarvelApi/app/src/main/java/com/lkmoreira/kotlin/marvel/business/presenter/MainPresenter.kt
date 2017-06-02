package com.lkmoreira.kotlin.marvel.business.presenter

import com.lkmoreira.kotlin.marvel.business.presenter.base.BasePresenterImpl
import com.lkmoreira.kotlin.marvel.business.view.base.BaseView
import org.androidannotations.annotations.EBean

/**
 * This is responsible
 * @author Lucas Moreira <lucasm.java@gmail.com>
 * @since 02/06/2017.
 */
@EBean
open class MainPresenter : BasePresenterImpl<BaseView>() {

    override fun onSuccess() {
        view?.showError("Teste")
    }

    override fun onError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}