package com.example.goods.interfaces.repository.inmemory

import com.example.goods.entity.Users
import com.example.goods.usecases.UserRepository
import java.time.LocalDateTime

class UserRepositoryImpl: UserRepository {

    override fun save(name: String, email: String, password: String): Long {
        return 100
    }

    override fun findById(userId: Long): Users? {
        return Users(userId,
            "shinoda",
            "shinoda@example.com",
            "password",
            LocalDateTime.now().toString(),
            LocalDateTime.now().toString())
    }

    override fun update(user: Users) {}

}