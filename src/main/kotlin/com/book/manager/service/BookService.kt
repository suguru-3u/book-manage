package com.book.manager.service

import com.book.manager.domain.domain.BookWithRental
import com.book.manager.domain.repository.BookRepository
import org.springframework.stereotype.Service

@Service
class BookService(private val bookRepository:BookRepository) {
    fun getList(): List<BookWithRental>{
        return bookRepository.findAllWithRental()
    }
}