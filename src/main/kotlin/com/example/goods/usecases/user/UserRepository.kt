package com.example.goods.usecases.user

import com.example.goods.entity.User

interface UserRepository {
    fun save(name:String,email:String,password:String):User
    fun update(user:User):User
    fun findById(userId:Long):User?
}