package com.book.manager.infrastructure.database.repository

import com.book.manager.domain.domain.Book
import com.book.manager.domain.domain.BookWithRental
import com.book.manager.domain.domain.Rental
import com.book.manager.domain.repository.BookRepository
import com.book.manager.infrastructure.database.mapper.custom.BookWithRentalMapper
import com.book.manager.infrastructure.database.mapper.custom.select
import com.book.manager.infrastructure.database.record.BookWithRentalRecord
import org.springframework.stereotype.Repository

@Suppress("SpringJavaInjectionPointsAutowiringInspection")
@Repository
class BookRepositoryImpl(
    private val bookWithRentalMapper:BookWithRentalMapper
):BookRepository {
    override fun findAllWithRental():List<BookWithRental>{
        return  bookWithRentalMapper.select().map { toModel(it)}
    }

    private fun toModel(record: BookWithRentalRecord):BookWithRental{
        val book = Book(
            record.id!!,
            record.title!!,
            record.author!!,
            record.releaseDate!!
        )
        val rental = record.userId?.let {
            Rental(
                record.id!!,
                record.userId!!,
                record.rentalDatetime!!,
                record.returnDeadline!!
            )
        }
        return BookWithRental(book,rental)
    }
}

