package com.bsav157.domain

data class Show(
    val id: Int,
    val url: String,
    val name: String,
    val type: String,
    val language: String,
    val genres: List<String>,
    val runtime: Int,
    val officialSite: String,
    val image: Image,
    val summary: String,
    val schedule: Schedule
)