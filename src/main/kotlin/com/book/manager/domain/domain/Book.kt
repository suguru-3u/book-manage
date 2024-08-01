package com.book.manager.domain.domain

import java.time.LocalDate

data class Book(
    val id:Long,
    val title:String,
    val author:String,
    val releaseDate: LocalDate
)