package com.example.goods.usecases.user

import com.example.goods.entity.Users

interface UserRepository {
    fun save(name:String,email:String,password:String):Long
    fun update(user:Users)
    fun findById(userId:Long):Users?
}