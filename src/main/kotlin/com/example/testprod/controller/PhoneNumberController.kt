package com.example.testprod.controller

import com.example.testprod.dto.CreatePhoneNumberRequest
import com.example.testprod.entity.PhoneNumber
import com.example.testprod.repository.PhoneNumberRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/phone-numbers")
class PhoneNumberController(
    private val repository: PhoneNumberRepository
) {

    @PostMapping
    fun create(
        @RequestBody request: CreatePhoneNumberRequest
    ): PhoneNumber {
        val phoneNumber = PhoneNumber(
            ownerName = request.ownerName,
            phoneNumber = request.phoneNumber
        )
        return repository.save(phoneNumber)
    }

    @GetMapping
    fun getAll(): List<PhoneNumber> {
        return repository.findAll()
    }
}