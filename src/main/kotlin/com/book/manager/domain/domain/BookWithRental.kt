package com.book.manager.domain.domain

data class BookWithRental(
    val book:Book,
    val rental:Rental?
){
    val isRental:Boolean
        get() = rental != null
}
