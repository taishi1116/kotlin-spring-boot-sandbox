//package com.example.goods.interfaces.repository.jpa
//
//import com.example.goods.entity.Users
//import com.example.goods.entity.User
//import com.example.goods.usecases.user.UserRepository
//import org.springframework.stereotype.Repository
//import java.util.Optional
//
//
//@Repository
//class UserRepositoryImpl(val jpaRepository: JpaUserRepository): UserRepository{
//
//
//    override fun findById(userId: Long): Users? {
//        val user: Optional<User?> = jpaRepository.findById(userId)
//        if(!user.isPresent) throw Exception()
//        return Users(
//            user.get().id,
//            user.get().name,
//            user.get().email,
//            user.get().password,
//            user.get().createdAt,
//            user.get().updatedAt,
//        )
//    }
//
//    override fun save(name: String, email: String, password: String): Users =
//         jpaRepository.save(
//            User(
//                id = 1,
//                name,
//                email,
//                password,
//                createdAt = "",
//                updatedAt = "",
//            )
//        )
//
//    override fun update(user: Users):Unit {
//        jpaRepository.save(
//            User(
//                user.id,
//                user.name,
//                user.email,
//                user.password,
//                user.createdAt,
//                updatedAt = "",
//            )
//        )
//    }
//}