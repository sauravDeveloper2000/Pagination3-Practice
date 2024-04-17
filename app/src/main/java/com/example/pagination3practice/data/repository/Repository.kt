package com.example.pagination3practice.data.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.pagination3practice.data.local.UnsplashDatabase
import com.example.pagination3practice.data.paging.UnsplashRemoteMediator
import com.example.pagination3practice.data.remote.UnsplashApi
import com.example.pagination3practice.model.UnsplashImage
import com.example.pagination3practice.util.Constants.ITEMS_PER_PAGE
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Repository @Inject constructor(
    private val unsplashApi: UnsplashApi,
    private val unsplashDatabase: UnsplashDatabase
) {
    @OptIn(ExperimentalPagingApi::class)
    fun getAllImages(): Flow<PagingData<UnsplashImage>>{
        val pagingSourceFactory = {unsplashDatabase.UnsplashImageDao().getAllImages()}
        return Pager(
            config = PagingConfig(pageSize = ITEMS_PER_PAGE),
            remoteMediator = UnsplashRemoteMediator(
                unsplashApi = unsplashApi,
                unsplashDatabase = unsplashDatabase
            ),
            pagingSourceFactory = pagingSourceFactory
        ).flow
    }
}