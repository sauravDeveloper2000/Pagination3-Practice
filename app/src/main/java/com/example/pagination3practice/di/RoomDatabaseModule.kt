package com.example.pagination3practice.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.pagination3practice.data.local.UnsplashDatabase
import com.example.pagination3practice.util.Constants
import com.example.pagination3practice.util.Constants.UNSPLASH_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomDatabaseModule {

    @Provides
    @Singleton
    fun providesDatabase(
        @ApplicationContext context: Context
    ): UnsplashDatabase{
        return Room.databaseBuilder(
            context,
            UnsplashDatabase::class.java,
            UNSPLASH_DATABASE
        ).build()
    }
}