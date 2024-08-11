package com.baldomero.napoli.eventplannerevents.domain.usecases

import com.baldomero.napoli.eventplanner.core.data.utils.NetworkResult
import com.baldomero.napoli.eventplannerevents.domain.models.BoardGame
import com.baldomero.napoli.eventplannerevents.domain.repositories.EventRepository
import com.rickclephas.kmp.nativecoroutines.NativeCoroutines
import kotlinx.coroutines.flow.Flow

class SearchBoardGamesUseCase(
    private val repository: EventRepository,
) {
    @NativeCoroutines
    suspend operator fun invoke(param: String): Flow<NetworkResult<List<BoardGame?>>> =
        repository.searchBoardGames(param)
}