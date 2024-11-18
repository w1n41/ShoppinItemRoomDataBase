package com.example.shoppinitemroomdatabase.utils

import android.content.Context
import androidx.room.Room
import com.example.shoppinitemroomdatabase.database.DataBase
import com.example.shoppinitemroomdatabase.models.Repository

object Graph{
    private lateinit var database: DataBase

    val repository by lazy {
        Repository(
            categoryDao = database.getCategoryDao(),
            itemDao = database.getItemDao()
        )
    }

    fun provide(context: Context){
        this.database = Room.databaseBuilder(context, DataBase::class.java, "shoppinItems.db").build()
    }
}