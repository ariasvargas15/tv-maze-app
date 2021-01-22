package com.bsav157.domain

data class Episode(
    val id: Int,
    val url: String,
    val name: String,
    val season: Int,
    val number: Int,
    val airdate: String,
    val image: Image,
    val summary: String
)
