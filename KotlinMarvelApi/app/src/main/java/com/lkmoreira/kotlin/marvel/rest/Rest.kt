package com.lkmoreira.kotlin.marvel.rest

import android.content.Context
import android.net.Uri

import com.google.gson.GsonBuilder
import com.lkmoreira.kotlin.marvel.R

import org.androidannotations.annotations.AfterInject
import org.androidannotations.annotations.EBean
import org.androidannotations.annotations.RootContext
import org.androidannotations.annotations.res.StringRes

import java.util.concurrent.TimeUnit

import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * This is responsible
 * @author Lucas Moreira <lucasm.java@gmail.com>
 * @since 05/06/2017.
 */
@EBean(scope = EBean.Scope.Singleton)
class Rest {

    @RootContext
    protected var context: Context? = null

    @StringRes(R.string.api_url)
    protected var apiUrl: String? = null

    // APIs
    private var api: Api? = null

    @AfterInject
    internal fun afterInjection() {
        buildApi()
    }

    fun buildApi() {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY

        val client = OkHttpClient.Builder()
                //.addNetworkInterceptor(new LoggingInterceptor())
                //.addNetworkInterceptor(new AuthenticatorInterceptor(context))
                .addNetworkInterceptor(logging)
                .cache(Cache(context!!.cacheDir, (10 * 1024 * 1024).toLong())) //10MG
                .readTimeout(30, TimeUnit.SECONDS)
                .connectTimeout(30, TimeUnit.SECONDS)
                .build()

        val builder = Uri.Builder()
        builder.scheme("https").authority(apiUrl)
        val url = builder.build().toString()

        val retrofit = Retrofit.Builder()
                .client(client)
                .baseUrl(url)
                //use for convert JSON file into object
                .addConverterFactory(GsonConverterFactory.create(GsonBuilder()
                        .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                        .create()))
                .build()

        api = retrofit.create(Api::class.java)
    }

    // API Helpers ---------------------------------------
    fun apiClient(): Api {
        return api!!
    }
}
