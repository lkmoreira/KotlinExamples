package com.lkmoreira.kotlin.marvel.business.activity.base

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager
import android.widget.Toast
import com.lkmoreira.kotlin.marvel.business.presenter.base.BasePresenter
import com.lkmoreira.kotlin.marvel.business.view.base.BaseView
import org.androidannotations.annotations.AfterViews
import org.androidannotations.annotations.EActivity

/**
 * This is responsible
 * @author Lucas Moreira <lucasm.java@gmail.com>
 * @since 02/06/2017.
 */
@EActivity
abstract class BaseActivity <in V : BaseView, T : BasePresenter<V>>
    : AppCompatActivity(), BaseView {

    //@NonConfigurationInstance
    protected var isFirstRunAfterViews: Boolean? = true

    protected abstract var presenter: T

    @AfterViews
    protected fun baseAfterViews() {
        presenter.attachView(this as V)
        if (isFirstRunAfterViews!!.not()) {
            reloadAfterViews()
            return
        }
        afterViews()
        this.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)
        isFirstRunAfterViews = false
    }

    protected open fun afterViews() {}

    protected fun reloadAfterViews() {}

    override fun getContext(): Context = this

    override fun showError(error: String?) {
        Toast.makeText(this, error, Toast.LENGTH_LONG).show()
    }

    override fun showError(stringResId: Int) {
        Toast.makeText(this, stringResId, Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }
}