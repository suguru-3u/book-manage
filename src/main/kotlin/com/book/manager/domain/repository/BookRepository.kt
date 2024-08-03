package com.book.manager.domain.repository

import com.book.manager.domain.domain.Book
import com.book.manager.domain.domain.BookWithRental

interface BookRepository {
    fun findAllWithRental():List<BookWithRental>

    fun findWithRental(id:Long):BookWithRental?

    fun register(book: Book)
}