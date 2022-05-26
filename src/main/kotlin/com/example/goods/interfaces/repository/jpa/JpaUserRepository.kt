package com.example.goods.interfaces.repository.jpa

import com.example.goods.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface JpaUserRepository : JpaRepository<User?, Long> {}
