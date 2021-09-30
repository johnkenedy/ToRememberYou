package com.example.torememberyou.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.torememberyou.model.ItemEntity

@Dao
interface ItemEntityDao {

    @Query("SELECT * FROM item_entity")
    fun getAllItemEntities(): List<ItemEntity>

    @Insert
    fun insertAll(itemEntity: ItemEntity)

    @Delete
    fun delete(itemEntity: ItemEntity)

}