package com.tyxapp.bangumi_jetpack.main.home.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.tyxapp.bangumi_jetpack.repository.HomeDataRepository

@Suppress("UNCHECKED_CAST")
class CategoryViewModelFactory(
    private val homeDataRepository: HomeDataRepository
) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CategoryViewModel(homeDataRepository) as T
    }
}