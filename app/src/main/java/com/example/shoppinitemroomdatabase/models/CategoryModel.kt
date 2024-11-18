package com.example.shoppinitemroomdatabase.models

import androidx.room.ColumnInfo
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Entity("category")
data class CategoryModel(
    @PrimaryKey(true)
    val id: Long = 0,
    @ColumnInfo("name")
    val name: String
)

@Dao
interface CategoryDao{
    @Insert
    abstract fun addNewCategory(categoryModel: CategoryModel)

    @Delete
    abstract fun deleteCategory(categoryModel: CategoryModel)

    @Query("Select * From category")
    abstract fun selectAllCategories(): Flow<List<CategoryModel>>

    @Update
    abstract fun updateCategories(categoryModel: CategoryModel)
}