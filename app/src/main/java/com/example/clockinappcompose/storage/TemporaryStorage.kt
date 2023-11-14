package com.example.clockinappcompose.storage

import com.example.clockinappcompose.model.Guest

class TemporaryStorage: StorageOperation {
    private val guestContainer: ArrayList<Guest> = arrayListOf()

    override fun addGuest(guest: Guest) {
        guestContainer.add(guest)
    }

    override fun showAllGuest(): List<Guest> {
        return guestContainer
    }

    override fun deleteGuest(id: String) {
        for (myGuest in guestContainer) {
            if (myGuest.id.toString() == id) {
                // remove from storage
                guestContainer.remove(myGuest)
            }
        }
    }

    override fun updateGuest(id: String) {
        // no action
    }

    override fun sizeOfStorage(): String {
        return guestContainer.size.toString()
    }
}