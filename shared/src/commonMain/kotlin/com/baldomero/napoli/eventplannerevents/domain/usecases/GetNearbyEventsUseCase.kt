package com.baldomero.napoli.eventplannerevents.domain.usecases

import com.baldomero.napoli.eventplanner.core.data.utils.NetworkResult
import com.baldomero.napoli.eventplannerevents.domain.models.Event
import com.baldomero.napoli.eventplannerevents.domain.repositories.EventRepository
import com.rickclephas.kmp.nativecoroutines.NativeCoroutines
import kotlinx.coroutines.flow.Flow


class GetNearbyEventsUseCase(
    private val repository: EventRepository,
) {
    @NativeCoroutines
    suspend operator fun invoke(
        page: Int,
        lat: Double,
        long: Double
    ): Flow<NetworkResult<List<Event?>>> =
        repository.getNearbyEvents(page = page, lat = lat, long = long)
}
