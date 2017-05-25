package com.lkmoreira.kotlin.retrofit.rest.api

import com.lkmoreira.kotlin.retrofit.model.Person
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * This is responsible
 * @author Lucas Moreira <lucasm.java@gmail.com>
 * @since 24/05/2017.
 */
interface Api {
    @GET("people/4/")
    fun getDarthVader() : Observable<Person>

}