package com.example.shoppinitemroomdatabase.models

import androidx.room.ColumnInfo
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Insert
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Entity(
    "item",
    foreignKeys = [
        ForeignKey(
            entity = CategoryModel::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("categoryId"),
            onDelete = ForeignKey.CASCADE
        )
    ]
)

data class ItemModel(
    @PrimaryKey(true)
    val id: Long = 0,
    @ColumnInfo("name")
    val name: String,
    @ColumnInfo("categoryId")
    val categoryId: Long = 0,
)

@Dao
interface ItemDao{
    @Insert
    abstract fun addNewItem(itemModel: ItemModel)

    @Delete
    abstract fun deleteItem(itemModel: ItemModel)

    @Query("Select * From item Where categoryId = :categoryId")
    abstract fun selectItemsByCategory(categoryId: Long): Flow<List<ItemModel>>

    @Update
    abstract fun updateItem(itemModel: ItemModel)
}