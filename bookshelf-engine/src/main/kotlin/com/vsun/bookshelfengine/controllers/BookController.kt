package com.vsun.bookshelfengine.controllers

import com.vsun.bookshelfengine.dtos.Book
import com.vsun.bookshelfengine.services.BookService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@RestController
class BookController {
    val logger: Logger = LogManager.getLogger("Bookshelf")

    @PostMapping("/books")
    fun createBook(@RequestBody book: Book): Book {

        val testBook = Book(id = 1, name = "test", author = "me")
        return testBook
    }

    @GetMapping("/books")
    fun getBooks(): String {
        logger.info("START getBooks")

        logger.info("END getBooks")
        return "hitting GET books\n"
    }
}