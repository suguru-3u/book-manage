package com.book.manager.domain.domain

import java.time.LocalDateTime

data class Rental(
    val bookId:Long,
    val userId:Long,
    val rentalDatetime:LocalDateTime,
    val returnDeadline:LocalDateTime
)
