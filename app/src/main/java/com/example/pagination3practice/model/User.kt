package com.example.pagination3practice.model

import androidx.room.Embedded
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
    @SerialName(value = "links")
    @Embedded
    val userLinks: UserLinks,
    val username: String
)
