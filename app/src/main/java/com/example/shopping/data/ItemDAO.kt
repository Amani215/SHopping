package com.example.shopping.data

import androidx.room.*

@Dao
interface ItemDAO {
    @Transaction
    @Query("SELECT * FROM item")
    fun getAllItems(): List<ItemCategoryRelationship>

    @Insert
    fun insertItem(item: ShoppingItem) : Long

    @Delete
    fun deleteItem(item: ShoppingItem)

    @Update
    fun updateItem(item: ShoppingItem)
}