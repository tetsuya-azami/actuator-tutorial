package com.example.actuator.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/")
@RestController
class DummyController {

    @RequestMapping("/hello")
    fun hello(): String{
        return "{\"result\": \"hello\"}"
    }
}