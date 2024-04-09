package com.example.pagination3practice.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.example.pagination3practice.model.UnsplashRemoteKeys

@Dao
interface UnsplashRemoteKeyDao {
    @Query("SELECT * FROM unsplash_remote_keys_table WHERE id =:id")
    suspend fun getRemoteKeys(id: String): UnsplashRemoteKeys

    @Upsert
    suspend fun addAllRemoteKeys(remoteKeys: List<UnsplashRemoteKeys>)

    @Query("DELETE FROM unsplash_remote_keys_table")
    suspend fun deleteAllRemoteKeys()
}