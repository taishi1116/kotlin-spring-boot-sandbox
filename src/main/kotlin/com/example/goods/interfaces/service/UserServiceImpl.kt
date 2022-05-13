package com.example.goods.interfaces.service

import com.example.goods.entity.Users
import com.example.goods.usecases.user.UserRepository
import com.example.goods.usecases.user.UserService
import org.springframework.stereotype.Service


@Service
class UserServiceImpl(private val userRepository: UserRepository) : UserService{

    override fun find(id: Long): Users {
        // TODO エラーハンドリング
        val result = userRepository.findById(id)
        if(result === null) throw Exception()
        return result
    }

    // TODO 本来であれば引数のuserはentityなので日時を持たないはず
    // 日時はアプリケーション要件なのでserviceクラスで定義するべき
    override fun create(user: Users):Long {
       return  userRepository.save(user.name,user.email,user.password)
    }

    // TODO 本来であれば引数のuserはentityなので日時を持たないはず
    // 日時はアプリケーション要件なのでserviceクラスで定義するべき
    override fun update(user: Users) {
        userRepository.update(user)
    }
}