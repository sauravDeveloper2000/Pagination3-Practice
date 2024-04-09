package com.example.pagination3practice.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.pagination3practice.data.local.dao.UnsplashImageDao
import com.example.pagination3practice.data.local.dao.UnsplashRemoteKeyDao
import com.example.pagination3practice.model.UnsplashImage
import com.example.pagination3practice.model.UnsplashRemoteKeys

@Database(
    entities = [UnsplashImage::class, UnsplashRemoteKeys::class],
    version = 1
)
abstract class UnsplashDatabase: RoomDatabase() {
    abstract fun UnsplashImageDao(): UnsplashImageDao
    abstract fun UnsplashRemoteKeysDao(): UnsplashRemoteKeyDao
}