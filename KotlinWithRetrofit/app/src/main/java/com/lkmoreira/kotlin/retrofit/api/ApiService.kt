package com.lkmoreira.kotlin.retrofit.api

import io.reactivex.Observable
import retrofit2.http.GET

/**
 * This is responsible
 * @author Lucas Moreira <lucasm.java@gmail.com>
 * @since 24/05/2017.
 */
interface ApiService {
    @GET("people/4/")
    fun getDarthVader() : Observable<Character>

}