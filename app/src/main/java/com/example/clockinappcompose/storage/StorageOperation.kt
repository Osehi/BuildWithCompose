package com.example.clockinappcompose.storage

import com.example.clockinappcompose.model.Guest

interface StorageOperation {

    fun addGuest(guest: Guest)

    fun showAllGuest(): List<Guest>

    fun deleteGuest(id: String)

    fun updateGuest(id: String)

    fun sizeOfStorage(): String
}