package com.lkmoreira.kotlin.retrofit

import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import com.lkmoreira.kotlin.retrofit.rest.ApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.androidannotations.annotations.AfterViews
import org.androidannotations.annotations.EActivity
import org.androidannotations.annotations.ViewById

@EActivity(R.layout.activity_main)
open class MainActivity : AppCompatActivity() {

    @ViewById
    protected lateinit var name: TextView

    @ViewById
    protected lateinit var gender: TextView

    @ViewById
    protected lateinit var birth: TextView


    @AfterViews
    protected fun afterViews() {
        ApiService().api.getDarthVader()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { person ->
                                name.text = person.name
                                gender.text = person.gender
                                birth.text = person.birthYear
                        },
                        { error -> Log.e("Error", error.message) }
                )
    }
}
