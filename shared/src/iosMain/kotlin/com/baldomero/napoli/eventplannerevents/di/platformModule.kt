package com.baldomero.napoli.eventplannerevents.di

import com.baldomero.napoli.eventplannerevents.presentation.EventViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.dsl.module


actual fun platformModule() = module {
    factory {  EventViewModel(get(), get(), get(),get(),get(),get()) }
}

@Suppress("unused")
object ViewModels : KoinComponent {
    fun eventViewModel() = get<EventViewModel>()
}