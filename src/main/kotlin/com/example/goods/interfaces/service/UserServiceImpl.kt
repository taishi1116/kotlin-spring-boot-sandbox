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

    override fun create(name:String,email:String,password:String):Long {
       return  userRepository.save(name,email,password)
    }

    // TODO 本来であれば引数のuserはentityなので日時を持たないはず
    // 日時はアプリケーション要件なのでserviceクラスで定義するべき
    override fun update(id:Long,name:String,email:String,password:String) {
        // TODO エラーハンドリング
        val user = userRepository.findById(id)
        if(user === null) throw Exception()

        val updatedUser = Users(id,name,email,password,user.createdAt.toString(),user.updatedAt.toString())
        userRepository.update(user)
    }
}