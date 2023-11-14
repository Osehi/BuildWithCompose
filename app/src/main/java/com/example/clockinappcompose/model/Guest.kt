package com.example.clockinappcompose.model

import java.util.UUID

data class Guest(
    val guestName: String,
    val date: String,
    val time: String,
    val id: UUID = UUID.randomUUID()
)