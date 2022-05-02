package com.example.goods.usecases.user

import com.example.goods.entity.Users
import com.example.goods.usecases.UserRepository



// TODO エラーハンドリング
class findService(private val id:Long, private val userRepository: UserRepository){
    fun execute():Users {
        val result = userRepository.findById(id)
        if(result === null) throw Exception()
        return result
    }
}