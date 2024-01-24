package com.example.mealsproject.di

import com.example.data.remote.ApiServies
import com.example.data.repo.MealsRepoImp
import com.example.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideRepo(apiService: ApiServies): MealsRepo {
        return MealsRepoImp(apiService)
    }
}