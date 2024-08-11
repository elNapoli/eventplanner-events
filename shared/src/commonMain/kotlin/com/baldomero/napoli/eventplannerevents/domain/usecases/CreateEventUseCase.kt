package com.baldomero.napoli.eventplannerevents.domain.usecases

import com.baldomero.napoli.eventplanner.core.data.utils.NetworkResult
import com.baldomero.napoli.eventplannerevents.domain.models.Event
import com.baldomero.napoli.eventplannerevents.domain.repositories.EventRepository
import com.rickclephas.kmp.nativecoroutines.NativeCoroutines
import kotlinx.coroutines.flow.Flow

class CreateEventUseCase(
    private val repository: EventRepository,
) {
    @NativeCoroutines
    suspend operator fun invoke(
        event: Event,
        file: ByteArray
    ): Flow<NetworkResult<Boolean>> =
        repository.createEvent(
            event = event,
            file = file
        )
}
