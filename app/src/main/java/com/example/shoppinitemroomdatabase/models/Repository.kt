package com.example.shoppinitemroomdatabase.models

import kotlinx.coroutines.flow.Flow

class Repository(
    private val categoryDao: CategoryDao,
    private val itemDao: ItemDao
){
    //Category suspend functions
    suspend fun addCategory(categoryModel: CategoryModel){
        categoryDao.addNewCategory(categoryModel)
    }
    suspend fun deleteCategory(categoryModel: CategoryModel){
        categoryDao.deleteCategory(categoryModel)
    }
    suspend fun updateCategory(categoryModel: CategoryModel){
        categoryDao.updateCategories(categoryModel)
    }
    suspend fun selectAllCategories() : Flow<List<CategoryModel>> {
        return categoryDao.selectAllCategories()
    }

    //Item suspend functions
    suspend fun addItem(itemModel: ItemModel){
        itemDao.addNewItem(itemModel)
    }
    suspend fun deleteItem(itemModel: ItemModel){
        itemDao.deleteItem(itemModel)
    }
    suspend fun updateItem(itemModel: ItemModel){
        itemDao.updateItem(itemModel)
    }
    suspend fun selectItemsByCategory(categoryId: Long): Flow<List<ItemModel>>{
        return  itemDao.selectItemsByCategory(categoryId = categoryId)
    }
}