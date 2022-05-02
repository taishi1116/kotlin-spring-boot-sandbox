package com.example.goods.usecases.user

import com.example.goods.entity.Users
import com.example.goods.usecases.UserRepository

// TODO エラーハンドリング
class updateService(private val users: Users, private val userRepository: UserRepository) {
    fun execute(){
        userRepository.update(users)
    }
}