package com.example.domain.repo

import com.example.domain.entity.CategoryResponse

interface MealsRepo {
    fun getMealsFromRemote(): CategoryResponse
}