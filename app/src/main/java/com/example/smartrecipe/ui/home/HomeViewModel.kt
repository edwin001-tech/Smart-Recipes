package com.example.smartrecipe.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    private val _navigateToBilling = MutableLiveData<Boolean>()
    val navigateToBilling: LiveData<Boolean>
        get() = _navigateToBilling

    fun onFabClicked() {
        _navigateToBilling.value = true
    }

    fun onNavigatedToBilling() {
        _navigateToBilling.value = false
    }
}