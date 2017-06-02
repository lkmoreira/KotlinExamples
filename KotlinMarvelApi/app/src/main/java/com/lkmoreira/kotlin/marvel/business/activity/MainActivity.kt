package com.lkmoreira.kotlin.marvel.business.activity

import com.lkmoreira.kotlin.marvel.R
import com.lkmoreira.kotlin.marvel.business.activity.base.BaseActivity
import com.lkmoreira.kotlin.marvel.business.presenter.MainPresenter
import com.lkmoreira.kotlin.marvel.business.view.base.BaseView
import org.androidannotations.annotations.EActivity

@EActivity(R.layout.activity_main)
open class MainActivity : BaseActivity<BaseView, MainPresenter>(), BaseView {

    override var presenter: MainPresenter = MainPresenter()

    override fun afterViews() {

        presenter.onSuccess()
    }

}
