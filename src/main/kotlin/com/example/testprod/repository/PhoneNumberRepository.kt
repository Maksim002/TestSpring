package com.example.testprod.repository

import com.example.testprod.entity.PhoneNumber
import org.springframework.data.jpa.repository.JpaRepository

interface PhoneNumberRepository : JpaRepository<PhoneNumber, Long>