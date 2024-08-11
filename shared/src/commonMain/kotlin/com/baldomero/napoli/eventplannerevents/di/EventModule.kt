package com.baldomero.napoli.eventplannerevents.di

import com.baldomero.napoli.eventplannerevents.data.querys.EventQueries
import com.baldomero.napoli.eventplannerevents.data.repositories.EventRepositoryImpl
import com.baldomero.napoli.eventplannerevents.domain.repositories.EventRepository
import com.baldomero.napoli.eventplannerevents.domain.usecases.CreateEventUseCase
import com.baldomero.napoli.eventplannerevents.domain.usecases.GetEventByIdUseCase
import com.baldomero.napoli.eventplannerevents.domain.usecases.GetEventsByAttendeeUseCase
import com.baldomero.napoli.eventplannerevents.domain.usecases.GetNearbyEventsUseCase
import com.baldomero.napoli.eventplannerevents.domain.usecases.SearchBoardGamesUseCase
import dev.jordond.compass.geolocation.Geolocator
import dev.jordond.compass.geolocation.mobile
import org.koin.core.module.Module
import org.koin.dsl.module

@Suppress("unused")
object EventModule {

    private fun repositoryModule() = module {
        single<EventRepository> { EventRepositoryImpl(get()) }
    }
    private fun queryModule()=module{
        single {
            EventQueries(get())
        }
    }

    private fun appModule()=module{
        single { Geolocator.mobile() }
    }

    private fun useCaseModule() = module {
        single { CreateEventUseCase(get()) }
        single { GetEventsByAttendeeUseCase(get()) }
        single { GetEventByIdUseCase(get()) }
        single { SearchBoardGamesUseCase(get()) }
        single { GetNearbyEventsUseCase(get()) }
    }

    fun init(): Module = module {
        includes(platformModule(), repositoryModule(), useCaseModule(), queryModule(), appModule())
    }
}