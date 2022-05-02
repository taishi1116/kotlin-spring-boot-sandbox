package com.example.goods.usecases.user

import com.example.goods.usecases.UserRepository


// TODO エラーハンドリング
class createService(private val name:String, private val email:String, private val password:String, private val userRepository: UserRepository) {
    fun execute():Long{
        return  userRepository.save(name,email,password)
    }
}