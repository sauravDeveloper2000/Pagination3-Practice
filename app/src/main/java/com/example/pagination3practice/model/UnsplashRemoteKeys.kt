package com.example.pagination3practice.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.pagination3practice.util.Constants

/**
 * UnsplashRemoteKeys - This table is being used by our remote mediator to know which page to request next.
 */
@Entity(tableName = Constants.UNSPLASH_REMOTE_KEYS_TABLE)
data class UnsplashRemoteKeys(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val prevPage: Int?,
    val nextPage: Int?
)
