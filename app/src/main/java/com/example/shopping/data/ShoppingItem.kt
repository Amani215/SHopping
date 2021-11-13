package com.example.shopping.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "item")
data class ShoppingItem(
    @PrimaryKey(autoGenerate = true) var itemId : Long?,
    @ColumnInfo(name = "itemCategoryID") var itemCategoryID: Long,
    @ColumnInfo(name = "name") var name: String,
    @ColumnInfo(name = "description") var description: String,
    @ColumnInfo(name = "estimatedPrice") var estimatedPrice: Double,
    @ColumnInfo(name = "status") var status: Boolean
): Serializable
