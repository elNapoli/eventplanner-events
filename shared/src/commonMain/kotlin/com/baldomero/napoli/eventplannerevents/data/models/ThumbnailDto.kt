package com.baldomero.napoli.eventplannerevents.data.models

import com.baldomero.napoli.eventplannerevents.domain.models.Thumbnail
import com.baldomeronapoli.eventplanner.mappers.Mappable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ThumbnailDto(
    @SerialName("id")
    val id: String,
    @SerialName("bucket_id")
    val bucketId: String,
    @SerialName("name")
    var name: String,
) : Mappable<Thumbnail> {
    override fun toInstance(): Thumbnail = Thumbnail(
        id = id,
        name = name,
        bucketId = bucketId
    )
}
