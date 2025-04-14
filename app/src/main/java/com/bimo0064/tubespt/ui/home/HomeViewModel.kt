package com.bimo0064.tubespt.ui.home

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(HomeState(username = "User"))
    val uiState: StateFlow<HomeState> = _uiState
}