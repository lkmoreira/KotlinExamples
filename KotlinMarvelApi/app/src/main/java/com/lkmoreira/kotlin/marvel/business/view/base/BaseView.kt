package com.lkmoreira.kotlin.marvel.business.view.base

import android.content.Context
import android.support.annotation.StringRes

/**
 * This is responsible
 * @author Lucas Moreira <lucasm.java@gmail.com>
 * @since 02/06/2017.
 */
interface BaseView {

    fun getContext(): Context

    fun showError(error: String?)

    fun showError(@StringRes stringResId: Int)

}