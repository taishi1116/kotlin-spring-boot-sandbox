package com.example.goods.interfaces.service

import com.example.goods.interfaces.repository.jpa.JpaUserRepository
import com.example.goods.entity.User
import com.example.goods.usecases.user.UserService
import org.springframework.stereotype.Service


@Service
class UserServiceImpl(private val userRepository: JpaUserRepository) : UserService{

    override fun find(id: Long): User {
        return userRepository.getById(id)
    }

    override fun create(name:String,email:String,password:String):Long {
       val user = userRepository.save(
           User(
               1,
               name,
               email,
               password,
               createdAt = "",
               updatedAt = "",
           )
       )
        return user.id
    }

    override fun update(id:Long,name:String,email:String,password:String) {
        val user = userRepository.getById(id)
        userRepository.save(
            User(
                id,
                name,
                email,
                password,
                createdAt = user.createdAt,
                updatedAt = "",
            )
        )
    }
}