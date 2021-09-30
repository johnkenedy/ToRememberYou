package com.example.torememberyou

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.torememberyou.dao.ItemEntityDao
import com.example.torememberyou.model.ItemEntity

@Database(
    entities = [ItemEntity::class],
    version = 1
)
abstract class AppDataBase: RoomDatabase() {
    abstract fun itemEntityDao() : ItemEntityDao
}