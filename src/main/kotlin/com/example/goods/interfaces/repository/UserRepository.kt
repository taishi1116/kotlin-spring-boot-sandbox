package com.example.goods.interfaces.repository

import com.example.goods.entity.Users

interface UserRepository {
    fun create(user:Users)
    fun update(user:Users)
    fun findById(userId:Long)
}