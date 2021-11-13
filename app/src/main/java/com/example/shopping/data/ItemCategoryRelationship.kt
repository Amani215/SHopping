package com.example.shopping.data

import androidx.room.Embedded
import androidx.room.Relation

data class ItemCategoryRelationship(
    @Embedded val category: Category,
    @Relation(
        parentColumn = "categoryID",
        entityColumn = "itemCategoryID"
            )
    val items: List<ShoppingItem>
)