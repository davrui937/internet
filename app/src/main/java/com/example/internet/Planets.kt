package com.example.internet

import android.os.Parcelable
import kotlinx.serialization.*
import kotlinx.parcelize.Parcelize

@Parcelize
data class Planets (
    val name: String,

    @SerialName("rotation_period")
    val rotationPeriod: String,

    @SerialName("orbital_period")
    val orbitalPeriod: String,

    val diameter: String,
    val climate: String,
    val gravity: String,
    val terrain: String,

    @SerialName("surface_water")
    val surfaceWater: String,

    val population: String,
    val residents: List<String>,
    val films: List<String>,
    val created: String,
    val edited: String,
    val url: String
): Parcelable
