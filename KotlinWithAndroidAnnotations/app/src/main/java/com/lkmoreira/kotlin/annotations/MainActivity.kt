package com.lkmoreira.kotlin.annotations

import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import org.androidannotations.annotations.AfterViews
import org.androidannotations.annotations.EActivity
import org.androidannotations.annotations.ViewById

@EActivity(R.layout.activity_main)
open class MainActivity : AppCompatActivity() {

    @ViewById
    protected lateinit var title: TextView

    @AfterViews
    protected fun afterViews() {
        title.setText(R.string.app_name)
    }
}
