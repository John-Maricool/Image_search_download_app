package com.codinginflow.imagesearchapp.api

import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {

    companion object {
        const val BASE_URL = "https://api.unsplash.com/"
        const val CLIENT_ID = "ziqkqEFkLqOVmky3zq3lS_9np01eo3bd7tPge-764DQ"
    }

    @Headers("Accept.Version: v1", "Authorization: Client-ID $CLIENT_ID")
    @GET("search/photos")
     suspend fun searchPhotos(
         @Query("query") query: String,
         @Query("page") page: Int,
         @Query("per_page") perPage: Int,
     ): UnsplashResponse
}