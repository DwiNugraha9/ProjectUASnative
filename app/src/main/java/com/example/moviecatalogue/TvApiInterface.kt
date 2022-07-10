package com.example.moviecatalogue

import retrofit2.Call
import retrofit2.http.GET

interface TvApiInterface {

    @GET("/3/tv/popular?api_key=a6f8577db952cc60887343d04f43f93a")
    fun getTvList(): Call<TvResponse>
}