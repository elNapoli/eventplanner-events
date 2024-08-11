package com.baldomero.napoli.eventplannerevents.data.models

import com.baldomero.napoli.eventplannerevents.domain.models.BoardGame
import com.baldomeronapoli.eventplanner.mappers.Mappable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BoardGameDTO(
    @SerialName("id") val id: Int,
    @SerialName("board_game_publisher") val boardGamePublisher: String?,
    @SerialName("image") var image: String?,
    @SerialName("name") var name: String?,
    @SerialName("thumbnail") var thumbnail: String?,
    @SerialName("year_published") var yearPublished: Int?,
    @SerialName("bgg_id") var bggId: Int?,
) : Mappable<BoardGame> {
    override fun toInstance(): BoardGame = BoardGame(
        id = id,
        boardGamePublisher = boardGamePublisher,
        image = image,
        name = name,
        bggId = bggId,
        thumbnail = thumbnail,
        yearPublished = yearPublished
    )
}
