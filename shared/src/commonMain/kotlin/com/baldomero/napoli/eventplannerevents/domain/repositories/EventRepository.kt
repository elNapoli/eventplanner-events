package com.baldomero.napoli.eventplannerevents.domain.repositories

import com.baldomero.napoli.eventplanner.core.data.utils.NetworkResult
import com.baldomero.napoli.eventplannerevents.domain.models.BoardGame
import com.baldomero.napoli.eventplannerevents.domain.models.Event
import com.rickclephas.kmp.nativecoroutines.NativeCoroutines
import kotlinx.coroutines.flow.Flow

interface EventRepository {

    @NativeCoroutines
    suspend fun createEvent(
        event: Event,
        file: ByteArray
    ): Flow<NetworkResult<Boolean>>

    @NativeCoroutines
    suspend fun getEventById(
        eventId: String
    ): Flow<NetworkResult<Event?>>

    @NativeCoroutines
    suspend fun getEventsByAttendee(): Flow<NetworkResult<List<Event?>>>

    @NativeCoroutines
    suspend fun getNearbyEvents(
        page: Int,
        lat: Double,
        long: Double
    ): Flow<NetworkResult<List<Event?>>>


    @NativeCoroutines
    suspend fun searchBoardGames(query: String): Flow<NetworkResult<List<BoardGame?>>>

}