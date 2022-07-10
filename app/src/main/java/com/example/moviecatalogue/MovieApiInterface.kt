package com.example.moviecatalogue

import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=a6f8577db952cc60887343d04f43f93a")
    fun getMovieList(): Call<MovieResponse>
}