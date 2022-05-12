package com.example.goods.interfaces.controller

import org.hibernate.annotations.UpdateTimestamp
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/users")
class UserController {


    @GetMapping("/{id}")
    fun getUser(@PathVariable id: String){

    }

    @PostMapping
    fun postUser(@RequestBody ){}

    @PutMapping
    fun updateUser(){}

    @DeleteMapping
    fun deleteUser(){}


}