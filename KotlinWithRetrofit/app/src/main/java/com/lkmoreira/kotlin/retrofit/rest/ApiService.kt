package com.lkmoreira.kotlin.retrofit.rest

import com.google.gson.GsonBuilder
import com.lkmoreira.kotlin.retrofit.rest.api.Api
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * This is responsible
 * @author Lucas Moreira <lucasm.java@gmail.com>
 * @since 25/05/2017.
 */
class ApiService {
    val gson = GsonBuilder().create()!!

    val retrofit: Retrofit = Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl("http://swapi.co/api/")
            .build()

    val api: Api get() = retrofit.create(
            Api::class.java)
}