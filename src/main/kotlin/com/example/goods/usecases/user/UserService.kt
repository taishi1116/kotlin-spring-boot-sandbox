package com.example.goods.usecases.user

import com.example.goods.entity.Users

interface UserService {
    fun find(id: Long):Users
    fun create(user:Users):Long
    fun update(user:Users)
}