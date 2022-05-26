package com.example.goods.entity

import javax.persistence.*

//  クリーンアーキテクチャでいうとentityがwebフレームワークに依存するのはNGなのでアノテーションは入ってこないはず
@Entity
@Table(name = "users")
data class User(
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(nullable = false)
    val name: String,


    @Column(nullable = false)
    val email: String,

    @Column(nullable = false)
    val password: String,

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    val createdAt: String,


    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    val updatedAt: String
)