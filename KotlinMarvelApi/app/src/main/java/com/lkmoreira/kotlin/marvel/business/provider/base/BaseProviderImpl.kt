package com.lkmoreira.kotlin.marvel.business.provider.base

import com.lkmoreira.kotlin.marvel.rest.Rest
import org.androidannotations.annotations.Bean
import org.androidannotations.annotations.EBean

/**
 * This is responsible
 * @author Lucas Moreira <lucasm.java@gmail.com>
 * @since 05/06/2017.
 */

@EBean
class BaseProviderImpl : BaseProvider {

    @Bean
    protected var rest: Rest? = null

    companion object {

        protected val TAG = "Retrofit"
    }
}
