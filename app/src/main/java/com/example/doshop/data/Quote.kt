package com.example.doshop.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quote")
data class Quote(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val title: String,

    val userId: Int,

    val description: String

)
