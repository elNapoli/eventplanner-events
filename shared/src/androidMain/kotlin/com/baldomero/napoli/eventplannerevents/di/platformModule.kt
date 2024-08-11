package com.baldomero.napoli.eventplannerevents.di

import com.baldomero.napoli.eventplannerevents.presentation.EventViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

actual fun platformModule() = module {
    viewModel { EventViewModel(get(), get(), get(),get(),get(),get()) }
}