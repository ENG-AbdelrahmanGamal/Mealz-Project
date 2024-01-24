package com.example.mealsproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.hamalawey.mealz.MealsViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel:MealsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val recyclerView:RecyclerView=findViewById(R.id.category_rv)
        viewModel.getMeals()
        val mealzAdapter=MealsAdapter()


        lifecycleScope.launch {
            viewModel.categories.collect{
                mealzAdapter.submitList(it?.categories)
                 recyclerView.adapter=mealzAdapter
            }
        }
    }
}