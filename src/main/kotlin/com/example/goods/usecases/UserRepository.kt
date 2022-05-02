package com.example.goods.usecases

import com.example.goods.entity.Users

interface UserRepository {
    fun create(user:Users)
    fun update(user:Users)
    fun findById(userId:Long)
}