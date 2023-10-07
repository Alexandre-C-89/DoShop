package com.example.doshop.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

interface QuoteDao {

    @Insert
    suspend fun insert(quote: Quote)

    @Query("SELECT * from user WHERE id = :id")
    fun getQuote(id: Int): Flow<User>

    @Query("SELECT * from user ORDER BY name ASC")
    fun getAllQuotes(): Flow<List<Quote>>

    @Update
    suspend fun update(quote: Quote)

    @Delete
    suspend fun delete(quote: Quote)
}