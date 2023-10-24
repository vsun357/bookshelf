package com.vsun.bookshelfengine.services

import com.vsun.bookshelfengine.dtos.Book
import org.springframework.stereotype.Service

@Service
interface BookService {
    fun createBook(book: Book): Book

    fun getBooks(): List<Book>

    fun getBook(id: String): Book
}