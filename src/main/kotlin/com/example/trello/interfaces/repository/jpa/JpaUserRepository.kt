package com.example.trello.interfaces.repository.jpa

import com.example.trello.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface JpaUserRepository : JpaRepository<User?, Long> {}
