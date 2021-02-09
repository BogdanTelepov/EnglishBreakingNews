package com.e.englishbreakingnews.repository

import com.e.englishbreakingnews.api.RetrofitInstance
import com.e.englishbreakingnews.database.ArticleDatabase

class NewsRepository(val db: ArticleDatabase) {


    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)


    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchNews(searchQuery, pageNumber)


}