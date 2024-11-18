package com.example.shoppinitemroomdatabase.screens

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.shoppinitemroomdatabase.utils.ScreensRoute
import com.example.shoppinitemroomdatabase.viewmodels.CategoryViewModel
import com.example.shoppinitemroomdatabase.viewmodels.ItemViewModel

@Composable
fun Navigation() {
    val navHostController = rememberNavController()
    val categoryViewModel: CategoryViewModel = viewModel()
    val itemViewModel: ItemViewModel = viewModel()

    NavHost(
        navController = navHostController,
        startDestination = ScreensRoute.CATEGORIES_SCREEN
    ) {
        composable(route = ScreensRoute.CATEGORIES_SCREEN) {

            MainScreen(categoryViewModel, navHostController)
        }
        composable(route = ScreensRoute.ITEMS_SCREEN) {
            ItemsScreen(itemViewModel, navHostController, categoryViewModel)
        }
    }
}