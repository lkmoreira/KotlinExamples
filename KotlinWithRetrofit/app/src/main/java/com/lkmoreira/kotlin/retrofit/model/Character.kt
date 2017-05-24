package com.lkmoreira.kotlin.retrofit.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * This is responsible
 * @author Lucas Moreira <lucasm.java@gmail.com>
 * @since 24/05/2017.
 */
open class Character {

    @SerializedName("name")
    @Expose
    open var name: String? = null

    @SerializedName("height")
    @Expose
    open var height: String? = null

    @SerializedName("mass")
    @Expose
    open var mass: String? = null

    @SerializedName("hair_color")
    @Expose
    open var hairColor: String? = null

    @SerializedName("skin_color")
    @Expose
    open var skinColor: String? = null


    @SerializedName("eye_color")
    @Expose
    open var eyeColor: String? = null

    @SerializedName("birth_year")
    @Expose
    open var birthYear: String? = null
    @SerializedName("gender")
    @Expose
    open var gender: String? = null

    @SerializedName("homeworld")
    @Expose
    open var homeworld: String? = null

    @SerializedName("created")
    @Expose
    open var created: String? = null

    @SerializedName("edited")
    @Expose
    open var edited: String? = null

    @SerializedName("url")
    @Expose
    open var url: String? = null

}