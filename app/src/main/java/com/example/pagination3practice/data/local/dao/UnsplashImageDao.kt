package com.example.pagination3practice.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.example.pagination3practice.model.UnsplashImage

@Dao
interface UnsplashImageDao {

    @Query("SELECT * FROM unsplash_image_table")
    fun getAllImages(): PagingSource<Int, UnsplashImage>

    @Upsert
    fun addImages(images: List<UnsplashImage>)

    @Query("DELETE FROM unsplash_image_table")
    suspend fun deleteAllImages()
}