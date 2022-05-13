package com.example.goods.entity

import javax.persistence.*

// 本来ならdataclassのみでspring のアノテーションが入ったらダメ
@Entity
@Table(name = "goods")
data class Goods(
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,


    @Column(nullable = false)
    val name: String,


    @Column(nullable = true)
    val description: String? = null,

    @Column(nullable = false)
    val price: Long,


    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    val createdAt: String,

    
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    val updatedAt: String
)
