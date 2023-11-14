package com.example.clockinappcompose.utilities

import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

object Utilities {
    fun getInstantDate(): String {
        val getDate = SimpleDateFormat("dd-MMM-yyy", Locale.getDefault())
        val formatDate = getDate.format(Calendar.getInstance().time)
        return formatDate.toString()
    }

    fun getInstantTime(): String {
        val today = Date()
        val timeFormat = SimpleDateFormat("hh:mm:ss a")
        val capturedTime = timeFormat.format(today)
        return capturedTime
    }
}