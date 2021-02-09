package com.e.englishbreakingnews.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.e.englishbreakingnews.models.Article

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article): Long


    @Query("SELECT * from articles")
    fun getAllArticles(): LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)

}