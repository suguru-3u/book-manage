package com.book.manager.domain.repository

import com.book.manager.domain.domain.BookWithRental

interface BookRepository {
    fun findAllWithRental():List<BookWithRental>
}