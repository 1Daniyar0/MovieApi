package com.example.movieapi.model.response

import com.google.gson.annotations.SerializedName

data class ListMovieResponse (
    val results: List<Movie>
    )

data class Movie(
    val title: String,
    @SerializedName("poster_path")
    val image: String,
    val overview: String
    )