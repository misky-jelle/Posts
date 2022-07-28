package com.misky.myposts

import retrofit2.Call
import retrofit2.Callback
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("/posts")
    fun getPosts():Call<List<Posts>>

    @GET("/posts/{id}")
    fun getPostById(@Path("id")id:Int):Call<Posts>
}