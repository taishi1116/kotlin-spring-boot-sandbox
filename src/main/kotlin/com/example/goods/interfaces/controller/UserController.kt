package com.example.goods.interfaces.controller

import com.example.goods.entity.Users
import com.example.goods.interfaces.repository.inmemory.UserRepositoryImpl
import com.example.goods.usecases.user.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController {

    @Autowired
    private lateinit var  userService:UserService


    @GetMapping("/{id}")
    fun getUser(@PathVariable id: String):Users {
        return userService.find(id.toLong())
    }

    @PostMapping
    fun postUser(@RequestBody  name:String, email:String,password:String):Long{
         return userService.create(name,email, password)
    }

    @PutMapping
    fun updateUser(@RequestBody id:String,name:String,email:String,password:String ){
        userService.update(id.toLong(),name,email,password)
    }

    @DeleteMapping
    fun deleteUser(@PathVariable id:String){}


}