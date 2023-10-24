package com.vsun.bookshelfengine

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookshelfEngineApplication

fun main(args: Array<String>) {
    runApplication<BookshelfEngineApplication>(*args)
}
