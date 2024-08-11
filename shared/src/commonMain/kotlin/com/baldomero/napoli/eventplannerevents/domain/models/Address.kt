package com.baldomero.napoli.eventplannerevents.domain.models

import com.baldomero.napoli.eventplannerevents.data.models.AddressDTO
import com.baldomero.napoli.eventplannerevents.data.models.CoordinatesDTO
import com.baldomero.napoli.eventplannerevents.presentation.models.AddressUI
import com.baldomeronapoli.eventplanner.mappers.BiMappable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Address(
    @SerialName("id")
    val id: Int,

    @SerialName("name")
    val name: String?,

    @SerialName("street")
    val street: String,

    @SerialName("iso_country_code")
    val isoCountryCode: String?,

    @SerialName("country")
    val country: String,

    @SerialName("postal_code")
    val postalCode: String?,

    @SerialName("administrative_area")
    val administrativeArea: String?,

    @SerialName("sub_administrative_area")
    val subAdministrativeArea: String?,

    @SerialName("locality")
    val locality: String?,

    @SerialName("sub_locality")
    val subLocality: String?,

    @SerialName("thoroughfare")
    val thoroughfare: String?,

    @SerialName("sub_thoroughfare")
    val subThoroughfare: String?,

    val latitude: Double,
    @SerialName("longitude")
    val longitude: Double,
) : BiMappable<AddressDTO, AddressUI> {

    override fun mapToDto(): AddressDTO {
        return AddressDTO(
            id = id,
            name = name,
            street = street,
            isoCountryCode = isoCountryCode,
            country = country,
            postalCode = postalCode,
            administrativeArea = administrativeArea,
            subAdministrativeArea = subAdministrativeArea,
            locality = locality,
            subLocality = subLocality,
            thoroughfare = thoroughfare,
            subThoroughfare = subThoroughfare,
            coordinates = CoordinatesDTO(latitude, longitude)
        )
    }

    override fun mapToUI(): AddressUI {
        return AddressUI(
            id = id,
            name = name,
            street = street,
            isoCountryCode = isoCountryCode,
            country = country,
            postalCode = postalCode,
            administrativeArea = administrativeArea,
            subAdministrativeArea = subAdministrativeArea,
            locality = locality,
            subLocality = subLocality,
            thoroughfare = thoroughfare,
            subThoroughfare = subThoroughfare,
            latitude = latitude,
            longitude = longitude,
        )
    }
}
