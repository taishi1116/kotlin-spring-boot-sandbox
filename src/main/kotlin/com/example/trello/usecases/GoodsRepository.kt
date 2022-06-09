package com.example.trello.usecases

import com.example.trello.entity.Goods

interface GoodsRepository {
    fun getAll()
    fun findById(goodsId:Long)
    fun findByName(name:String)
    fun register(goods:Goods)
    fun update(goods:Goods)
    fun delete(goodsId:Long)
}