package com.basya.listbeli.data.repositories

import com.basya.listbeli.data.db.entities.ShoppingItem
import com.basya.listbeli.data.db.ShoppingDatabase

class ShoppingRepository(
    private val db: ShoppingDatabase
) {
    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()
}