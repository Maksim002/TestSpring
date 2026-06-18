package com.example.testprod

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class TestProdApplication

fun main(args: Array<String>) {
    runApplication<TestProdApplication>(*args)
}

@RestController
class HelloController {

    @GetMapping("/")
    fun home(): String {
        return "Spring Boot работает 🚀"
    }
}