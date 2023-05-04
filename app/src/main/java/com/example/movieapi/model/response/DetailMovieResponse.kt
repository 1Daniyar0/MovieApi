package com.example.movieapi.model.response

import com.google.gson.annotations.SerializedName
import java.math.BigDecimal

data class DetailMovieResponse (

    val budget: BigDecimal,
    @SerializedName("spoken_languages")
    val listNameLanguages: List<SpokenLanguages>,
    val genres: List<Genres>,
    @SerializedName("backdrop_path")
    val image: String,
    val tagline: String
    )


data class SpokenLanguages(
    @SerializedName("english_name")
    val nameLanguage: String,
)

data class Genres(
    val id: Int,
    val name: String
)