package com.example.data.repo

import com.example.data.remote.ApiServies
import com.example.domain.entity.CategoryResponse
import com.example.domain.repo.MealsRepo

class MealsRepoImp(private val apiServies: ApiServies):MealsRepo
{
    override fun getMealsFromRemote(): CategoryResponse =apiServies.getMeals()
}