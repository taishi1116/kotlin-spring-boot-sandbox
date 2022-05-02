package com.example.goods.interfaces.repository

import com.example.goods.entity.Goods

interface GoodsRepository {
    fun getAll()
    fun findById(goodsId:Long)
    fun findByName(name:String)
    fun register(goods:Goods)
    fun update(goods:Goods)
    fun delete(goodsId:Long)
}