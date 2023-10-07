package com.example.doshop.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    @Insert
    suspend fun insert(user: User)

    @Query("SELECT * from user WHERE id = :id")
    fun getItem(id: Int): Flow<User>

    @Update
    suspend fun update(user: User)

    @Delete
    suspend fun delete(user: User)

}