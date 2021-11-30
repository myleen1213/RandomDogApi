package com.example.extractdogapi.api

import com.google.gson.annotations.JsonAdapter
import retrofit2.http.Url


data class ApiData(
    val fileSizeBytes: Int,
    val url: String
)
