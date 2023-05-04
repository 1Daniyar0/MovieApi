package com.example.movieapi.network

import retrofit2.http.GET

interface NetworkService {
    @GET("/discover/movie")
    fun getMovieList(){

    }

    @GET("/movie/{movie_id}")
    fun  getMovieItem(){

    }

}