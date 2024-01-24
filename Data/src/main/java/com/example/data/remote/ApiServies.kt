package com.example.data.remote

import com.example.domain.entity.CategoryResponse
import retrofit2.http.GET

interface ApiServies {

    @GET("categories.php")
    fun getMeals():CategoryResponse
}