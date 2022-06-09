package com.example.trello.usecases.user

import com.example.trello.entity.User

interface UserService {
    fun find(id: Long): User
    fun create(name:String,email:String,password:String):Long
    fun update(id: Long,name:String,email:String,password:String)
}