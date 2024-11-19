package com.example.shoppinitemroomdatabase.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.shoppinitemroomdatabase.models.CategoryDao
import com.example.shoppinitemroomdatabase.models.CategoryModel
import com.example.shoppinitemroomdatabase.models.ItemDao
import com.example.shoppinitemroomdatabase.models.ItemModel

@Database(
    entities = [CategoryModel::class, ItemModel::class],
    exportSchema = false,
    version = 1
)
abstract class DataBase: RoomDatabase(){
    abstract fun getCategoryDao(): CategoryDao

    abstract fun getItemDao(): ItemDao
}