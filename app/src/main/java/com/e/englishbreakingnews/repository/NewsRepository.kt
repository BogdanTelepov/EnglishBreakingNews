package com.e.englishbreakingnews.repository

import com.e.englishbreakingnews.api.RetrofitInstance
import com.e.englishbreakingnews.database.ArticleDatabase
import com.e.englishbreakingnews.models.Article

class NewsRepository(val db: ArticleDatabase) {


    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)


    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchNews(searchQuery, pageNumber)


    suspend fun upsert(article: Article) {
        db.getArticleDao().upsert(article)
    }

    suspend fun delete(article: Article) {
        db.getArticleDao().deleteArticle(article)
    }

    fun getSavedNews() = db.getArticleDao().getAllArticles()

}