package com.example.shopping.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "category")
data class Category(
    @PrimaryKey(autoGenerate = true) var categoryID : Long?,
    @ColumnInfo(name = "name") var name: String,
    @ColumnInfo(name = "imagePath") var imagePath: String
): Serializable
