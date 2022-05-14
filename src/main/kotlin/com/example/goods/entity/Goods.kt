package com.example.goods.entity

data class Goods(
    val id: Long,
    val name: String,
    val description: String? = null,
    val price: Long,
    val createdAt: String,
    val updatedAt: String
)
