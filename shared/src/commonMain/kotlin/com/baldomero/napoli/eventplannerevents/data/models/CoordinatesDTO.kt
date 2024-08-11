package com.baldomero.napoli.eventplannerevents.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class CoordinatesDTO(
    @SerialName("latitude")
    val latitude: Double,
    @SerialName("longitude")
    val longitude: Double,
)