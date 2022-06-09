package com.example.trello.interfaces.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController

class HealthCheckController {

    @GetMapping("/health-check")
    fun getHealthCheck():String{
        return "I'm healthy"
    }
}