package com.baldomero.napoli.eventplannerevents.data.requests

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AttendeeEventPagination(
    @SerialName("records_per_page")
    val recordsPerPage: Int,
    @SerialName("current_page")
    val currentPage: Int,
)