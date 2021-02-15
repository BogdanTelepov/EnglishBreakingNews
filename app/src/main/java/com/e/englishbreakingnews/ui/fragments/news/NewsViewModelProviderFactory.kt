package com.e.englishbreakingnews.ui.fragments.news

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.e.englishbreakingnews.repository.NewsRepository

class NewsViewModelProviderFactory(private val newsRepository: NewsRepository, val app: Application) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NewsViewModel(newsRepository, app) as T
    }
}