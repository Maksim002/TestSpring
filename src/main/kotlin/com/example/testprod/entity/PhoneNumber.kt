package com.example.testprod.entity

import jakarta.persistence.*

@Entity
@Table(name = "phone_numbers")
data class PhoneNumber(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(name = "owner_name", nullable = false)
    val ownerName: String,

    @Column(name = "phone_number", nullable = false, unique = true)
    val phoneNumber: String
)