package com.lkmoreira.kotlin.retrofit

import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.lkmoreira.kotlin.retrofit.rest.ApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.androidannotations.annotations.AfterViews
import org.androidannotations.annotations.EActivity

@EActivity(R.layout.activity_main)
open class MainActivity : AppCompatActivity() {

    @AfterViews
    protected fun afterViews() {
        ApiService().api.getDarthVader()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { person ->  Log.e("Person: ", person.name) },
                        { error ->  Log.e("Error", error.message) }
                )
    }
}
