package com.example.goods.interfaces.controller

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status


@SpringBootTest
@AutoConfigureMockMvc
class HealthCheckControllerTest {

    @Test
    fun `1＋1=2`() {
        assertEquals(2, 1 + 1)
    }

    @Test
    fun `ヘルスチェックエンドポイントを叩いて文言が帰ってくること`(@Autowired mockMvc : MockMvc){
        val expected = "I'm healthy"
        mockMvc.perform(get("/health-check"))
            .andExpect(status().isOk)
            .andExpect(content().string(expected))
    }
}