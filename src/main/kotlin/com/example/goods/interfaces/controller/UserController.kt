package com.example.goods.interfaces.controller

import com.example.goods.entity.User
import com.example.goods.usecases.user.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController {

    @Autowired
    private lateinit var  userService:UserService

    @GetMapping("/test")
    fun getTest():String {
        return "hello"
    }


    @GetMapping("/{id}")
    fun getUser(@PathVariable id: String):User {
        return userService.find(id.toLong())
    }

    @PostMapping
    fun postUser(@RequestBody  name:String, email:String,password:String):Long{
         return userService.create(name,email, password)
    }

    @PutMapping("/{id}")
    fun updateUser(@PathVariable id: String, @RequestBody name:String,email:String,password:String ){
        userService.update(id.toLong(),name,email,password)
    }

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id:String){}


}