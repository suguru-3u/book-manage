package com.book.manager.service

import com.book.manager.domain.domain.BookWithRental
import com.book.manager.domain.repository.BookRepository
import org.springframework.stereotype.Service
import javax.imageio.metadata.IIOInvalidTreeException

@Service
class BookService(private val bookRepository: BookRepository) {
    fun getList(): List<BookWithRental> {
        return bookRepository.findAllWithRental()
    }

    fun getDetail(bookId: Long): BookWithRental {
        return bookRepository.findWithRental(
            bookId
        )
            ?: throw IllegalArgumentException("存在しない書籍ID: $bookId")
    }
}